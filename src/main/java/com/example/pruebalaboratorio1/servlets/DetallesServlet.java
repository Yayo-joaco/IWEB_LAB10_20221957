package com.example.pruebalaboratorio1.servlets;

import com.example.pruebalaboratorio1.beans.genero;
import com.example.pruebalaboratorio1.beans.pelicula;
import com.example.pruebalaboratorio1.beans.streaming;
import com.example.pruebalaboratorio1.daos.detallesDao;
import com.example.pruebalaboratorio1.daos.listasDao;
import com.example.pruebalaboratorio1.daos.peliculaDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "detalle-servlet", value = "/viewPelicula")
public class DetallesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");


        int idPelicula = Integer.parseInt(request.getParameter("idPelicula"));
        detallesDao detallesDao = new detallesDao();
        listasDao listaDao = new listasDao();

        pelicula movie = detallesDao.obtenerPelicula(idPelicula);
        ArrayList<genero> listaGeneros = listaDao.listarGeneros();
        ArrayList<streaming> listaStreaming = listaDao.listarStreaming();

        request.setAttribute("pelicula", movie);
        request.setAttribute("listaGeneros", listaGeneros);
        request.setAttribute("listaStreaming", listaStreaming);

        RequestDispatcher view = request.getRequestDispatcher("detalles.jsp");
        view.forward(request,response);
    }
}

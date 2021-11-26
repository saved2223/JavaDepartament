package com.company.controller;

import com.company.service.ServiceFactory;
import com.company.service.ServiceInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/auth")
public class AuthenticationServlet extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Integer personStatus = Integer.parseInt(request.getParameter("opt"));
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        ServiceInterface currentService = ServiceFactory.getInstance().getNeededService(personStatus);
        try {
            currentService.auth(login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if ((Session.getInstance().getStudent() == null) && (Session.getInstance().getTeacher() == null)) {
            request.setAttribute("errorMessage", "Неверный логин или пароль, попробуйте снова!");
            request.getRequestDispatcher("/auth.jsp").forward(request, response);
        } else  {
            response.sendRedirect("/home");
        }
    }

    }


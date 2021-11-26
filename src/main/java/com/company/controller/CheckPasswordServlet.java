package com.company.controller;

import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(urlPatterns = "/checkPass")
public class CheckPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.getRequestDispatcher("/checkPass.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String pass = req.getParameter("oldPassword");
        if(ServiceFactory.getInstance().getUtilService().arePasswordsSame(pass, Session.getInstance().getCurr().getPassword())){
            resp.sendRedirect("/changePass");
        }
        else {
            req.setAttribute("message", "Неверный старый пароль!");
            req.setAttribute("backPage", "/checkPass");
            req.getRequestDispatcher("/errorPage.jsp").forward(req, resp);
        }
    }


}

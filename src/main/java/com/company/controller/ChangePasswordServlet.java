package com.company.controller;

import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/changePass")
public class ChangePasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.getRequestDispatcher("/changePass.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if(ServiceFactory.getInstance().getUtilService().arePasswordsSame(req.getParameter("pass1"), req.getParameter("pass2"))){
            ServiceFactory.getInstance().getUtilService().changePassCurrUser(req.getParameter("pass1"));
            resp.sendRedirect("/home");
        }
        else{
            req.setAttribute("message", "Пароли не совпадают, попробуйте заново");
            req.setAttribute("backPage", "/changePass");
            req.getRequestDispatcher("/errorPage.jsp").forward(req, resp);
        }
    }
}
package com.company.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class HomePageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if(Session.getInstance().getTeacher() != null){
            req.setAttribute("user", Session.getInstance().getTeacher());
            getServletContext().getRequestDispatcher("/teacher/teacherHome.jsp").forward(req, resp);
        }
        else {
            req.setAttribute("user", Session.getInstance().getStudent());
            getServletContext().getRequestDispatcher("/student/studentHome.jsp").forward(req, resp);
        }
    }
}

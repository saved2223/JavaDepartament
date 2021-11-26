package com.company.controller;


import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/subjects")
public class SubjectsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if(Session.getInstance().getTeacher() != null){
            req.setAttribute("subjects", ServiceFactory.getInstance().getTeacherService().getSubjects());
        }
        else {
            req.setAttribute("subjects", ServiceFactory.getInstance().getStudentService().getSubjects());
        }
        getServletContext().getRequestDispatcher("/subjects.jsp").forward(req, resp);
    }
}

package com.company.controller.teacher;

import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createSubj")
public class CreateSubjectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setAttribute("kathedras", ServiceFactory.getInstance().getUtilService().getAllKaths());
        getServletContext().getRequestDispatcher("/teacher/createSubj.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServiceFactory.getInstance().getTeacherService().createSubject(Integer.parseInt(req.getParameter("kathId")),
                                                                       req.getParameter("name"),
                                                                       Integer.parseInt(req.getParameter("hours")),
                                                                       Integer.parseInt(req.getParameter("is_exam")),
                                                                       Integer.parseInt(req.getParameter("term")));
        resp.sendRedirect("/home");
    }
}

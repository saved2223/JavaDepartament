package com.company.controller.teacher;

import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createStudent")
public class CreateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setAttribute("kathedras", ServiceFactory.getInstance().getUtilService().getAllKaths());
        req.setAttribute("departaments", ServiceFactory.getInstance().getUtilService().getAllDeps());
        req.setAttribute("groups", ServiceFactory.getInstance().getUtilService().getAllGroups());
        getServletContext().getRequestDispatcher("/teacher/createStudent.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServiceFactory.getInstance().getTeacherService().createStudent(req.getParameter("name"),
                                                                       req.getParameter("date"),
                                                                       req.getParameter("adress"),
                                                                       Integer.parseInt(req.getParameter("dep")),
                                                                       Integer.parseInt(req.getParameter("kath")),
                                                                       Integer.parseInt(req.getParameter("term")),
                                                                       req.getParameter("login"),
                                                                       req.getParameter("password"),
                                                                       Integer.parseInt(req.getParameter("group"))
                );
        resp.sendRedirect("/home");
    }
}

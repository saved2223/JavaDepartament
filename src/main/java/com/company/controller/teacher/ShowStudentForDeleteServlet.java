package com.company.controller.teacher;

import com.company.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteStud")
public class ShowStudentForDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setAttribute("studs", ServiceFactory.getInstance().getUtilService().getAllStuds());
        req.getRequestDispatcher("/teacher/deleteStudent.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Integer id = Integer.parseInt(req.getParameter("id"));
        ServiceFactory.getInstance().getTeacherService().removeStudent(id);
        resp.sendRedirect("/home");
    }
}

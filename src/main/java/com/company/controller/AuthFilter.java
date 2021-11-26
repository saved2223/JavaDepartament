package com.company.controller;

import com.company.service.ServiceFactory;
import com.company.service.ServiceInterface;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter(urlPatterns = "/*")
public class AuthFilter implements javax.servlet.Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType("text/html");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String path = request.getServletPath();

        if ((Session.getInstance().getTeacher() == null) && (Session.getInstance().getStudent() == null) && (login == null) && (password == null) &&
        (!path.equals("/")) && (!path.equals("/auth")) &&(!path.equals("/index.jsp"))) {
            response.sendRedirect("/auth");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }
}

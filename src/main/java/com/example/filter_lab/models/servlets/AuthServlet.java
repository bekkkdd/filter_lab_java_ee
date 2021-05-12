package com.example.filter_lab.models.servlets;

import com.example.filter_lab.DBManager;
import com.example.filter_lab.models.User;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "AuthServlet", value = "/auth")
public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = DBManager.getUserByEmailAndPassword(login, password);
        HttpSession session = req.getSession();
        if (user != null) {
            session.setAttribute("user", user);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        else {
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
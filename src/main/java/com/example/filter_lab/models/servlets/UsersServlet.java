package com.example.filter_lab.models.servlets;

import com.example.filter_lab.DBManager;
import com.example.filter_lab.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

@WebServlet("/users")

public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = DBManager.getAllUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
}

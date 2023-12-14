package org.example;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/auth")
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("jsp/auth.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String login = req.getParameter("username");
        String passw = req.getParameter("password");
        String logpasw = login + ":" + passw;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Shmell\\IdeaProjects\\untitled1\\src\\main\\resources\\database.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals(logpasw)) {
                if (login.equals("suser"))
                    req.getRequestDispatcher("jsp/SuperUser.jsp").forward(req, resp);
                else
                    req.getRequestDispatcher("jsp/DefoltUser.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("jsp/auth.jsp").forward(req, resp);
            }
        }
        reader.close();
    }
}
package com.example.jdbcjsp.web;

import com.example.jdbcjsp.dao.StudentDAO;
import com.example.jdbcjsp.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {
    private final StudentDAO studentDAO = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("students", studentDAO.findAll());
        request.getRequestDispatcher("/WEB-INF/views/students.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equalsIgnoreCase(action)) {
            Student student = new Student();
            student.setName(request.getParameter("name"));
            student.setEmail(request.getParameter("email"));
            student.setCourse(request.getParameter("course"));
            studentDAO.insert(student);
        } else if ("delete".equalsIgnoreCase(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            studentDAO.delete(id);
        }

        response.sendRedirect(request.getContextPath() + "/students");
    }
}

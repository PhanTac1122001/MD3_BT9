package com.example.ss9b2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/user-data")
public class HelloServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        int id=Integer.parseInt(request.getParameter("id"));

        String name=request.getParameter("name");

        String email=request.getParameter("email");

        int age =Integer.parseInt(request.getParameter("age"));


        request.setAttribute("id",id);
        request.setAttribute("name",name);
        request.setAttribute("email",email);
        request.setAttribute("age",age);

        request.getRequestDispatcher("result.jsp").forward(request,response);

    }

    public void destroy() {
    }
}
package com.example.ss9b3;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")){
            request.setAttribute("username",username);

            //chuyển trang
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }else{
            request.setAttribute("error","Login failed!");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    public void destroy() {
    }
}
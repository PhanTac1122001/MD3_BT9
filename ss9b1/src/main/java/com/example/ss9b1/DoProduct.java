package com.example.ss9b1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/display-discount")
public class DoProduct extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String description=req.getParameter("productDescription");

        double price=Double.parseDouble(req.getParameter("price"));

        double discount=Double.parseDouble(req.getParameter("discountPercent"));

        double discountAmount= price*discount*0.01;

        double discountPrice=price-discountAmount;

        req.setAttribute("description",description);
        req.setAttribute("price",price);
        req.setAttribute("discount",discount);
        req.setAttribute("discountAmount",discountAmount);
        req.setAttribute("discountPrice",discountPrice);

        req.getRequestDispatcher("result.jsp").forward(req,resp);

    }
}

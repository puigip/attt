/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.SPDal;
import dal.UserDal;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.SP;
import model.User;

/**
 *
 * @author buigi
 */
@WebServlet(name = "listnguoidung", urlPatterns = {"/listnguoidung"})
public class listnguoidung extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listnguoidung</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listnguoidung at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) // get 
            throws ServletException, IOException {
        // Lấy danh sách người dùng
    List<User> list = new ArrayList<>();
    UserDal dao = new UserDal();
    list = dao.getAll();
    request.setAttribute("data", list);
    
    // Lấy danh sách sản phẩm
    List<SP> list1 = new ArrayList<>();
    SPDal dao1 = new SPDal();
    list1 = dao1.getAll();
    request.setAttribute("data1", list1);
    
    // Chuyển hướng đến JSP chỉ một lần
    request.getRequestDispatcher("administrator.jsp").forward(request, response);

    }
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 List<User> list = new ArrayList<>();
        UserDal dao=new UserDal();
        list=dao.getAll();
        request.setAttribute("data",list); 
        request.getRequestDispatcher("administrator.jsp").forward(request, response);  
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        UserDal dao=new UserDal();
        list=dao.getAll();
        for(User x:list){
            x.getTen();
        }
//       user.doGet(request, response);
    }
}

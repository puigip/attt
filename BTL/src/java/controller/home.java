/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.DBcontext;
import dal.UserDal;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author buigi
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class home extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet home</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>home " + request.getContextPath() + "</h1>");
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
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String tktmp= request.getParameter("username");
//        String mktmp=request.getParameter("password");
////            request.getRequestDispatcher("trangchu.jsp").forward(request, response);
//try{
//    DBcontext db=new DBcontext();
//    UserDal x=new UserDal();
//    if(x.timKiemtk(tktmp)!=0&&x.timKiemmk(tktmp).equals(mktmp)){
//        request.getRequestDispatcher("trangchu.jsp").forward(request, response);
//    }
//    else {
//        request.setAttribute("error", "Sai thông tin !");
//        request.getRequestDispatcher("index.html").forward(request, response);
//    }
//    
//}catch(Exception e){
//    
//}
//    }
//    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        String password=request.getParameter("password");
//            request.getRequestDispatcher("trangchu.jsp").forward(request, response);
try{
    DBcontext db=new DBcontext();
    UserDal x=new UserDal();
    if(x.timKiemtk(username)==0&&x.timKiemmk(username).equals(password))
    {
      if(x.timKiemid(username)==0){
           request.setAttribute("username", username);
            request.getRequestDispatcher("trangchu").forward(request, response);
      }
      else  request.getRequestDispatcher("administrator").forward(request, response);
    }
    else {
        request.getRequestDispatcher("index.html").forward(request, response);
    }
    
}catch(Exception e){
    
}
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
}

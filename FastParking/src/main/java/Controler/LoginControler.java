/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DAO.usuarioDAO;
import Model.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RUGGERY
 */
@WebServlet("/login")
public class LoginControler extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);      
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }

    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            usuarioDAO dao = new usuarioDAO();
            usuario usuario = dao.retriveByLogin(request.getParameter("txtemail"), request.getParameter("txtsenha"));
            if (usuario != null) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario_id", usuario.getId());
                response.sendRedirect(request.getContextPath() + "/menu");
            }
        } catch (Exception e) {
            
            PrintWriter out = response.getWriter();
            e.printStackTrace(out);
//            out.print(e.getMessage());
        }

    }
}

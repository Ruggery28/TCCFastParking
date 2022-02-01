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
@WebServlet("/menu")
public class MenuControler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            int usuarioId = (Integer) session.getAttribute("usuario_id");
            usuarioDAO dao = new usuarioDAO();
            usuario usuario = dao.retriveById(usuarioId);
            request.setAttribute("usuario", usuario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp");
            dispatcher.forward(request, response);
//            if (request.getParameter("btncmd") != null) {
//                if (request.getParameter("btncmd").equals("CADASTRAR")) {
//                    usuarioDAO dao = new usuarioDAO();
//                    usuario usuario = new usuario(0, request.getParameter("txtnome"), Integer.parseInt(request.getParameter("txtcpf")), request.getParameter("txtnascimento"), request.getParameter("txtemail"), request.getParameter("txtsenha"));
//                    dao.insert(usuario);
//                    RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.jsp");
//                    dispatcher.forward(request, response);
//                } else if (request.getParameter("btncmd").equals("ENTRAR")) {
//                    usuarioDAO dao = new usuarioDAO();
//                    usuario usuario = dao.retriveByLogin(request.getParameter("txtemail"), request.getParameter("txtsenha"));
//                    if (usuario != null) {
//                        request.setAttribute("usuario", usuario);
//                        RequestDispatcher dispatcher = request.getRequestDispatcher("firstpage.jsp");
//                        dispatcher.forward(request, response);
//                    } else {
//                        PrintWriter out = response.getWriter();
//                        out.print("Usuario não identificado");
//                    }
//                }
//
//            }
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }

    } 
    
}
        

 



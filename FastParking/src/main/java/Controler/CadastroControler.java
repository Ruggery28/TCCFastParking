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
@WebServlet("/cadastro")
public class CadastroControler extends HttpServlet {

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
            RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            usuarioDAO dao = new usuarioDAO();
            usuario usuario = new usuario(0, request.getParameter("txtnome"), Integer.parseInt(request.getParameter("txtcpf")), request.getParameter("txtnascimento"), request.getParameter("txtemail"), request.getParameter("txtsenha"));
            usuario.setSaldo(50.00);
            dao.insert(usuario);
            usuario = dao.retriveByLogin(usuario.getEmail(), usuario.getSenha());
            HttpSession session = request.getSession();
            session.setAttribute("usuario_id", usuario.getId());
            response.sendRedirect(request.getContextPath() + "/menu");          
        }catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }
    }

}

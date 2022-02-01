/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DAO.usuarioDAO;
import DAO.veiculoDAO;
import Model.usuario;
import Model.veiculo;
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
@WebServlet("/veiculo")
public class VeiculoControler extends HttpServlet {

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
        try{
            RequestDispatcher dispatcher = request.getRequestDispatcher("cad_veiculo.jsp");
            dispatcher.forward(request, response);
        }catch(Exception e){
           PrintWriter out = response.getWriter();
           out.print(e.getMessage());
        }
    }
    
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            HttpSession session = request.getSession();
            int usuarioId = (Integer) session.getAttribute("usuario_id");
            veiculoDAO dao = new veiculoDAO();
            veiculo veiculo = new veiculo(0, usuarioId, request.getParameter("txtrenavam"), request.getParameter("txtplaca"), request.getParameter("txtfabricacao"), request.getParameter("txtmodelo"));
            dao.insert(veiculo);
            response.sendRedirect(request.getContextPath() + "/menu");
        }catch(Exception e){
           PrintWriter out = response.getWriter();
           out.print(e.getMessage());
        }
    }
        

}

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
import Service.RotativoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet("/estacionamento")
public class EstacionamentoControler extends HttpServlet {

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
            
            ArrayList<veiculo> veiculos = new veiculoDAO().retriveAllByUsuario(usuarioId);//retorna todos veiculos
            request.setAttribute("veiculos", veiculos);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("estacionamento.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            int usuarioId = (Integer) session.getAttribute("usuario_id");
            int veiculoid = Integer.parseInt(request.getParameter("veiculo"));
            RotativoService service = new RotativoService();
            service.ativarRotativo(usuarioId, veiculoid);
            response.sendRedirect(request.getContextPath() + "/menu");          
        }catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print(e.getMessage());
        }
    }

}

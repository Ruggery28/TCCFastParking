/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.usuario;
import java.util.ArrayList;

/**
 *
 * @author RUGGERY
 */
public interface usuarioDAOInterface {
    
    public boolean insert(usuario usuario) throws usuarioDAOException;
    public boolean update(usuario usuario) throws usuarioDAOException;
    public boolean delete(int id) throws usuarioDAOException;
    public ArrayList<usuario> retriveAllusuario() throws usuarioDAOException;
    public ArrayList<usuario> retriveusuarioByLike(String like) throws usuarioDAOException;
    public usuario retriveById(int id) throws usuarioDAOException;
    public usuario retriveByLogin(String email, String senha) throws usuarioDAOException;
}

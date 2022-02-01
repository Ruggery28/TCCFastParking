/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author RUGGERY
 */
public class usuarioDAO implements usuarioDAOInterface {

    @Override
    public boolean insert(usuario usuario) throws usuarioDAOException {
        boolean bRet = false;

        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("insert into usuario (nome, cpf, nascimento, email, senha, saldo) values (?, ?, ?, ?, ?, ?)");
            pstm.setString(1, usuario.getNome());
            pstm.setInt(2, usuario.getCpf());
            pstm.setString(3, usuario.getNascimento());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getSenha());
            pstm.setDouble(6, usuario.getSaldo());
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return bRet;
    }

    @Override
    public boolean update(usuario usuario) throws usuarioDAOException {
        boolean bRet = false;

        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("update usuario set nome=?, cpf=?, nascimento=?, email=?, senha=?, saldo=?, id=?");
            pstm.setString(1, usuario.getNome());
            pstm.setInt(2, usuario.getCpf());
            pstm.setString(3, usuario.getNascimento());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getSenha());
            pstm.setDouble(6, usuario.getSaldo());
            pstm.setInt(7, usuario.getId());
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return bRet;
    }

    @Override
    public boolean delete(int id) throws usuarioDAOException {
        boolean bRet = false;

        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("delete from usuario where id = ?");
            pstm.setInt(1, id());
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return bRet;
    }

    @Override
    public ArrayList<usuario> retriveAllusuario() throws usuarioDAOException {
        ArrayList<usuario> arRet = new ArrayList<usuario>();

        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("select * from usuario");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                usuario usuario = new usuario(rs.getInt("id"), rs.getString("nome"), rs.getInt("cpf"), rs.getString("nascimento"), rs.getString("email"), rs.getString("senha"), rs.getDouble("saldo"));
                arRet.add(usuario);
            }
            ConnectionFactory.closeConnection(pstm, rs);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return arRet;
    }

    @Override
    public ArrayList<usuario> retriveusuarioByLike(String like) throws usuarioDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public usuario retriveById(int id) throws usuarioDAOException {
        usuario usuario = null;
        try { 
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("select * from usuario where id = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                usuario = new usuario(rs.getInt("id"), rs.getString("nome"), rs.getInt("cpf"), rs.getString("nascimento"), rs.getString("email"), "", rs.getDouble("saldo"));
            }

            rs.close();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return usuario;
    }

    private int id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public usuario retriveByLogin(String email, String senha) throws usuarioDAOException {
        usuario usuario = null;
        try { 
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("select * from usuario where email = ? and senha = ?");
            pstm.setString(1, email);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                usuario = new usuario(rs.getInt("id"), rs.getString("nome"), rs.getInt("cpf"), rs.getString("nascimento"), rs.getString("email"), rs.getString("senha"), rs.getDouble("saldo"));
            }

            rs.close();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new usuarioDAOException(e.getMessage());
        }
        return usuario;
    }
}

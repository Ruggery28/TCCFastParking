/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author RUGGERY
 */
public class veiculoDAO implements veiculoDAOInterface {

    @Override
    public boolean insert(veiculo veiculo) throws veiculoDAOException {
        boolean bRet = false;
        
        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("insert into veiculo (id_usuario, renavam, placa, fabricacao, modelo) values (?, ?, ?, ?, ?)");
            pstm.setInt(1, veiculo.getId_usuario());
            pstm.setString(2, veiculo.getRenavam());
            pstm.setString(3, veiculo.getPlaca());
            pstm.setString(4, veiculo.getFabricacao());
            pstm.setString(5, veiculo.getModelo());            
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new veiculoDAOException(e.getMessage());
        }
        return bRet;
    }

    @Override
    public boolean update(veiculo veiculo) throws veiculoDAOException {
         boolean bRet = false;
        
        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("update veiculo set id_usuario=?,renavam=?, placa=?, fabricacao=?, modelo=?, id_carro=?");
             pstm.setInt(1, veiculo.getId_usuario());
            pstm.setString(2, veiculo.getRenavam());
            pstm.setString(3, veiculo.getPlaca());
            pstm.setString(4, veiculo.getFabricacao());
            pstm.setString(5, veiculo.getModelo());
            pstm.setInt(6, veiculo.getId_carro());
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new veiculoDAOException(e.getMessage());
        }
        return bRet;
    }

    @Override
    public boolean delete(int id_carro) throws veiculoDAOException {
     boolean bRet = false;
        
        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("delete from veiculo where id_carro = ?");
            pstm.setInt(1, id_carro());
            bRet = pstm.execute();
            ConnectionFactory.closeConnection(pstm);
        } catch (Exception e) {
            throw new veiculoDAOException(e.getMessage());
        }
        return bRet;   
    }

    @Override
    public ArrayList<veiculo> retriveAllveiculo() throws veiculoDAOException {
        ArrayList<veiculo> arRet = new ArrayList<veiculo>();
        
        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("select * from veiculo");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                veiculo veiculo = new veiculo(rs.getInt("id_carro"), rs.getInt("id_usuario"), rs.getString("renavam"), rs.getString("placa"), rs.getString("fabricacao"), rs.getString("modelo"));
                arRet.add(veiculo);
            }  
            ConnectionFactory.closeConnection(pstm, rs);
        } catch (Exception e) {
            throw new veiculoDAOException(e.getMessage());
        }
        return arRet;
    }
    
    @Override
    public ArrayList<veiculo> retriveAllByUsuario(int usuarioId) throws veiculoDAOException {
        ArrayList<veiculo> arRet = new ArrayList<veiculo>();
        
        try {
            PreparedStatement pstm = ConnectionFactory.getConnection().prepareStatement("select * from veiculo where id_usuario = ?");
            pstm.setInt(1, usuarioId);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                veiculo veiculo = new veiculo(rs.getInt("id_carro"), rs.getInt("id_usuario"), rs.getString("renavam"), rs.getString("placa"), rs.getString("fabricacao"), rs.getString("modelo"));
                arRet.add(veiculo);
            }  
            ConnectionFactory.closeConnection(pstm, rs);
        } catch (Exception e) {
            throw new veiculoDAOException(e.getMessage());
        }
        return arRet;
    }

    @Override
    public ArrayList<veiculo> retriveveiculoByLike(String like) throws veiculoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public veiculo retriveByid_carro(int id_carro) throws veiculoDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int id_carro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



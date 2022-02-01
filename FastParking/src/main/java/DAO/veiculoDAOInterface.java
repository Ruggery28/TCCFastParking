/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.veiculo;
import java.util.ArrayList;

/**
 *
 * @author RUGGERY
 */
public interface veiculoDAOInterface {
    
    public boolean insert(veiculo veiculo) throws veiculoDAOException;
    public boolean update(veiculo veiculo) throws veiculoDAOException;
    public boolean delete(int id_carro) throws veiculoDAOException;
    public ArrayList<veiculo> retriveAllveiculo() throws veiculoDAOException;
    public ArrayList<veiculo> retriveveiculoByLike(String like) throws veiculoDAOException;
    public veiculo retriveByid_carro(int id_carro) throws veiculoDAOException;
    public ArrayList<veiculo> retriveAllByUsuario(int usuarioId) throws veiculoDAOException;
    
}

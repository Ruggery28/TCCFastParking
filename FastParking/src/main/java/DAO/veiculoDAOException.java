/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author RUGGERY
 */
public class veiculoDAOException extends Exception{
    
    public veiculoDAOException(String message) {
        super("ERRO EM ESTADO:" + message);
    }
    
}

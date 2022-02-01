/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author RUGGERY
 */
public class rotativo {
    
    private int id;
    private int id_usuario;
    private int id_veiculo;
    private double vl_pago;
    

    public rotativo(int id, int id_usuario, int id_veiculo, double vl_pago) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_veiculo = id_veiculo;
        this.vl_pago = vl_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public double getVl_pago() {
        return vl_pago;
    }

    public void setVl_pago(double vl_pago) {
        this.vl_pago = vl_pago;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author RUGGERY
 */
public class veiculo {

    private int id_carro;
    private int id_usuario;
    private String renavam;
    private String placa;
    private String fabricacao;
    private String modelo;

    public veiculo() {
        this.id_carro = -1;
        this.id_usuario = -1;
        this.renavam = "";
        this.placa = "";
        this.fabricacao = "";
        this.modelo = "";
    }

    public veiculo(int id_carro, int id_usuario, String renavam, String placa, String fabricacao, String modelo) {
        this.id_carro = id_carro;
        this.id_usuario = id_usuario;
        this.renavam = renavam;
        this.placa = placa;
        this.fabricacao = fabricacao;
        this.modelo = modelo;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

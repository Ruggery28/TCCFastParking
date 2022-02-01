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
public class usuario {
    
    private int id;
    private String nome;
    private int cpf;
    private String nascimento;
    private String email;
    private String senha;
    private double saldo;
    
    public usuario() {
        this.id = -1;
        this.nome = "";
        this.cpf = -1;
        this.nascimento = "";
        this.email = "";
        this.senha = "";
        this.saldo = 0.00;
    
}

    public usuario(int id, String nome, int cpf, String nascimento, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.00;
    }
    
     public usuario(int id, String nome, int cpf, String nascimento, String email, String senha, double saldo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}

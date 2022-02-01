/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RUGGERY
 */
public class ConnectionFactory {

    public static Connection Con;

    public static Connection getConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/fastparking?user=root&password=bomba000&autoReconnect=true&useSSL=false");//no video foi usado (//localhost)//
        } catch (Exception e) {
            out.println("ERRO DE CONEXÃO" + e.getMessage());
        }
        return Con;
    }

    public static void closeConnection() {
        try {
            Con.close();
        } catch (Exception e) {
            out.println("ERRO DE DESCONEXÃO" + e.getMessage());
        }
    }

    
    public static void closeConnection(PreparedStatement pstm) {
        try {
            pstm.close();
            Con.close();
        } catch (Exception e) {
            out.println("ERRO DE DESCONEXÃO" + e.getMessage());
        }
    }
    
     public static void closeConnection(Statement stm) {
        try {
            stm.close();
            Con.close();
        } catch (Exception e) {
            out.println("ERRO DE DESCONEXÃO" + e.getMessage());
        }
    }
     
     public static void closeConnection(PreparedStatement pstm, ResultSet rs) {
        try {
            rs.close();
            pstm.close();
            Con.close();
        } catch (Exception e) {
            out.println("ERRO DE DESCONEXÃO" + e.getMessage());
        }
    }
}

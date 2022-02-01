/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.ConnectionFactory;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RUGGERY
 */
public class RotativoService {

    private final double VALOR_ROTATIVO = 2.50;

    public void ativarRotativo(int id_usuario, int id_veiculo) {
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            //desconta o saldo do usuario
            PreparedStatement pstm1 = con.prepareStatement("update usuario set saldo = saldo - ? where id = ?");
            pstm1.setDouble(1, VALOR_ROTATIVO);
            pstm1.setInt(2, id_usuario);
            pstm1.executeUpdate();

            //registra o rotativo
            Calendar agora = Calendar.getInstance();
            PreparedStatement pstm2 = con.prepareStatement("insert into rotativo (id_usuario, id_veiculo, vl_pago, data_dia, horario) value (?, ?, ?, ?, ?)");
            pstm2.setInt(1, id_usuario);
            pstm2.setInt(2, id_veiculo);
            pstm2.setDouble(3, VALOR_ROTATIVO);
            pstm2.setDate(4, new Date(agora.getTime().getTime()));
            pstm2.setTime(5, new Time(agora.getTime().getTime()));
            pstm2.executeUpdate();
            con.commit();

            ConnectionFactory.closeConnection(pstm1);
        } catch (Exception e) {
            if (con != null) {
                try {
                    e.printStackTrace();
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(RotativoService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

}

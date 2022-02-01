<%-- 
    Document   : cadastro
    Created on : 13/01/2022, 20:11:10
    Author     : RUGGERY
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            @font-face{
                font-family: COCOGOOSE;
                src: url('font/cocogoose-webfont.woff');
            }
            div{
                color: #979dac; 
                font-family: COCOGOOSE;
            }
            .required:after{
                content:" *";
                color: #33415c;
            }
            .bt {
                background-color: #33415c;
                border:0px solid #33415c;
                border-radius:20px;
                display:inline-block;
                cursor:pointer;
                color: #979dac;
                font-family:COCOGOOSE;
                font-size:20px;
                text-decoration:none;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body bgcolor="#979dac" style="margin-top: 50px">
    <center>
        <div style="box-shadow: 5px 5px 15px rgba(0,0,0,0.4);background-image: linear-gradient(to top, rgba(0,40,85,1), rgba(4,102,200,1));
             width: 450px; height: 650px;padding-top: 2px;border-radius: 20px;">
            <div style=""><img src="img/credito.png" width="60px" height="60px">Adicione Creditos</div>
            <div>Escolha o Valor: </div>

            <form>
                <input class="bt" type="submit" name="btn20" value="$ 20,00" style="font-size:14px; vertical-align: central; width:100px; height: 25px">
                <input class="bt" type="submit" name="btn40" value="$ 40,00" style="font-size:14px; vertical-align: central; width:100px; height: 25px">
            </form>

            <form style="padding-top:20px">
                <input class="bt" type="submit" name="btn80" value="$ 80,00" style="font-size:14px; vertical-align: central; width:100px; height: 25px">
                <input class="bt" type="submit" name="btn100" value="$ 100,00" style="font-size:14px; vertical-align: central; width:100px; height: 25px">
            </form>

            <form name="frmvalor" method="post" action="">
                <div style="text-align: center;padding-top: 20px">Outro Valor :</div>
                <input class="bt" type="number" name="nbvalor" style="text-align: center; size: 30px; width:100px; height: 30px">            
            </form><br>

            <div>Escolha outro método: </div>

            <form name="forradio" method="post">
                <table>
                    <tr><td style="text-align: center"><input type="radio" name="radmetodo" value="boleto"></td> <td>Boleto</td></tr>
                    <tr><td style="text-align: center"><input type="radio" name="radmetodo" value="credito"></td> <td>Cartão de Crédito</td></tr>
                    <tr><td style="text-align: center"><input type="radio" name="radmetodo" value="debito"></td> <td>Cartão de Débito</td></tr>
                    <tr><td style="text-align: center"><input type="radio" name="radmetodo" value="trans"></td> <td>Transferência</td></tr>
                    <tr><td style="text-align: center"><input type="radio" name="radmetodo" value="pix"></td> <td>PIX</td></tr>
                </table>
            </form>

            <form name="btnadicionar" method="post">
                <div align="center" style="padding-top: 2px"> 
                    <input class="bt" type="submit" name="btnadicionar" value="ADICIONAR" style="float: left; vertical-align: central; width:150px; height: 60px">    
                </div>
            </form>

            <a  class="bt" href="menu" style="float: right; vertical-align: central; width:150px; height: 60px">VOLTAR</a>



        </div>
    </center><br><br>

    <%
//        if (request.getParameter("btnadicionar") != null) {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/fastparking?user=root&password=bomba000&autoReconnect=true&useSSL=false");
//
//            PreparedStatement pstm = con.prepareStatement("INSERT INTO veiculo(renavam, placa, fabricacao, modelo) VALUES(?, ?, ?, ?)");
//            pstm.setString(1, request.getParameter("txtrenavam"));
//            pstm.setString(2, request.getParameter("txtplaca"));
//            pstm.setString(3, request.getParameter("txtfabricacao"));
//            pstm.setString(4, request.getParameter("txtmodelo"));
//            pstm.execute();
//            pstm.close();
//
//            Statement stm = con.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * from veiculo");
//
//            out.print("<table border='1' >" + "<tr>" + "<th>ID_Veiculo</th><th>Codigo Renavam</th><th>Placa</th><th>Ano de Fabricação</th><th>Ano Modelo</th></tr>");
//
//            while (rs.next()) {
//                out.print("<tr><td>" + rs.getString("id_carro") + "</td><td>" 
//                        + rs.getString("renavam") + "</td><td>" + rs.getString("placa")
//                        + "</td><td>" + rs.getString("fabricacao") + "</td><td>" + rs.getString("modelo") + "</td></tr>");
//            }
//
//            out.print("</table>");
//
//            stm.close();
//            rs.close();
//            con.close();
//        }
%> 

</body>
</html>

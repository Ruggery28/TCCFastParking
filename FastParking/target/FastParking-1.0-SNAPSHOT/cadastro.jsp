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

            <form name="frmcadastro" method="post" action="cadastro">
                <div class="required" style="text-align: left;padding-left: 20px;padding-top: 30px">Nome Completo : </div>
                <input type="text" name="txtnome" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div class="required" style="text-align: left;padding-left: 20px;padding-top: 30px">CPF :</div>    
                <input type="number" name="txtcpf" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div class="required" style="text-align: left;padding-left: 20px;padding-top: 30px">Data de Nascimento :</div>       
                <input type="date" name="txtnascimento" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div  class="required"style="text-align: left;padding-left: 20px;padding-top: 30px">E-mail :</div>         
                <input type="email" name="txtemail" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div  class="required"style="text-align: left;padding-left: 20px;padding-top: 30px">Senha :</div>
                <input type="password" name="txtsenha" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div align="center" style="padding-top: 50px"> 
                    <input class="bt" type="submit" name="btncmd" value="CADASTRAR" style="width:250px; height: 60px"></div></form>

            
                <div align="center" style="padding-top: 30px;">                       
                    <a href="index.jsp" class="bt" style="width:250px; height: 60px">
                       <span style="font-size: 20px">VOLTAR</span>
                    </a></div>

        </div>
    </center><br><br>

    <%
        //    if (request.getParameter("btncadastrar") != null) {
        //        Class.forName("com.mysql.jdbc.Driver");
        //        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/fastparking?user=root&password=bomba000&autoReconnect=true&useSSL=false");
        //
        //        PreparedStatement pstm = con.prepareStatement("INSERT INTO usuario(nome,cpf,nascimento,email,senha) VALUES(?, ?, ?, ?, ?)");
        //        pstm.setString(1, request.getParameter("txtnome"));
        //        pstm.setString(2, request.getParameter("txtcpf"));
        //        pstm.setString(3, request.getParameter("txtnascimento"));
        //        pstm.setString(4, request.getParameter("txtemail"));
        //        pstm.setString(5, request.getParameter("txtsenha"));
        //        pstm.execute();
        //        pstm.close();
        //
        //        Statement stm = con.createStatement();
        //        ResultSet rs = stm.executeQuery("SELECT * from usuario");
        //
        //        out.print("<table border='1' >" + "<tr>" + "<th>ID_User</th><th>Nome</th><th>CPF</th><th>Nascimento</th><th>E-mail</th><th>Senha</th></tr>");
        //
        //        while (rs.next()) {
        //            out.print("<tr><td>" + rs.getString("id") + "</td><td>" + rs.getString("nome")
        //                    + "</td><td>" + rs.getString("cpf") + "</td><td>" + rs.getString("nascimento")
        //                    + "</td><td>" + rs.getString("email") + "</td><td>" + rs.getString("senha") + "</td></tr>");
        //        }
        //
        //        out.print("</table>");
        //
        //        stm.close();
        //        rs.close();
        //        con.close();
        //    }
%> 

</body>
</html>

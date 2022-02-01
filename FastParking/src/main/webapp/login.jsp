<%-- 
    Document   : entrar
    Created on : 14/01/2022, 22:44:59
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
            @font-face{
                font-family: COCOGOOSE;
                src: url('font/cocogoose-webfont.woff');
            }
            div{
                color: #979dac; 
                font-family: COCOGOOSE;
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
            <form name="frminicial" method="post" action="login" >
                
                <div style="padding-top: 70px"><img src="img/logotcc.png" width="80%" height="60%"></div>

                <div style="text-align: left;padding-left: 20px;padding-top: 30px">E-mail :</div>         
                <input type="email" name="txtemail" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">

                <div style="text-align: left;padding-left: 20px;padding-top: 30px">Senha :</div>
                <input type="password" name="txtsenha" style="width:400px; height: 20px; background: none; border: none; border-bottom: 1px solid #979dac">


                <div align="center" style="padding-top: 50px">                      
                    <input class="bt" type="submit" name="btncmd" value="ENTRAR" style="width:250px; height: 60px"></div>

            </form>
            
            <div style="text-align: center;padding-top: 30px">
            <a href="index.jsp" class="bt" style="width:250px; height: 60px">
               <span style="font-size: 20px">VOLTAR</span>
            </a></div>



</div>
</center>
<%
//        if (request.getParameter("btnentrar") != null) {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/fastparking?user=root&password=bomba000&autoReconnect=true&useSSL=false");
//
//                PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuario WHERE email=? AND senha=?");
//                pstm.setString(1, request.getParameter("txtemail"));
//                pstm.setString(2, request.getParameter("txtsenha"));
//                ResultSet rs = pstm.executeQuery();
//
//                while (rs.next()) {
//                    session.setAttribute("nome", rs.getString("nome"));
//                }
//
//                pstm.close();
//                rs.close();
//                con.close();
//                if (session.getAttribute("nome") != null) {
//                    out.print("logado");
//                } else {
//                    out.print("Não logado");
//                }
//        }
%>
</body>
</html>

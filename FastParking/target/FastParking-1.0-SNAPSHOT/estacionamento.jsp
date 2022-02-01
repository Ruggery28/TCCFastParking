<%-- 
    Document   : cadastro
    Created on : 13/01/2022, 20:11:10
    Author     : RUGGERY
--%>


<%@page import="Model.usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="Model.veiculo"%>
<%@page import="java.util.ArrayList"%>
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
            .bt2 {
                background-color: #33415c;
                border:0px solid #33415c;
                border-radius:20px;
                display:inline-block;
                color: #979dac;
                font-family:COCOGOOSE;
                text-decoration:none;
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
    <%
        session.setAttribute("usuario", (usuario) (request.getAttribute("usuario")));
    %>
    <body bgcolor="#979dac" style="margin-top: 50px">
    <center>
        <div style="box-shadow: 5px 5px 15px rgba(0,0,0,0.4);background-image: linear-gradient(to top, rgba(0,40,85,1), rgba(4,102,200,1));
             width: 450px; height: 650px;padding-top: 2px;border-radius: 20px;">
            <div style=""><img src="img/estacionamento.png" width="60px" height="60px">Estacionamento</div>

            <div style="padding-top: 12px; font-size: 20px">Olá <%=((usuario) (session.getAttribute("usuario"))).getNome()%></div>
            <div style="font-size: 20px; padding-bottom: 60px">Aonde gostaria de estacionar hoje?</div>


            <form style="padding-top: 35px;background-color:#979dac; width: 300px; height: 280px;border-radius: 15px;" name="frmestacionamento" method="post" action="estacionamento">
                <div><span class="bt2" style="padding-bottom: 20px; font-size:20px; vertical-align: central; width:200px; height: 40px">
                        Seu Saldo é <br>
                        <%=((usuario) (session.getAttribute("usuario"))).getSaldo()%>
                    </span></div>

                <div style="padding-top: 15px">
                    <a href="adc_creditos.jsp" class="bt" style="font-size:14px;vertical-align: central; width:150px; height: 50px">
                        ADICIONAR SALDO</a>

                    <div style="padding-top: 25px">
                    <select class="bt" name="veiculo" id="veiculo"> 
                        <option class="bt" value="-1">Selecione um Veiculo </option>
                        <%
                            for (veiculo v : ((ArrayList<veiculo>) request.getAttribute("veiculos"))) {
                                out.println("<option value=\"" + v.getId_carro() + "\">" + v.getPlaca() + " </option>");
                            }
                        %>
                    </select></div>

                    <div align="center" style="padding-top: 25px">
                        <input class="bt" type="submit" name="btncadastrar" value="OK" style="width:100px; height: 40px"></div>
                </div>
            </form>

            <div style="padding-top: 30px">
                <a  class="bt" href="menu" style="width:150px; height: 60px">VOLTAR</a>
            </div>

    </center>

</body>
</html>

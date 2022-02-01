<%-- 
    Document   : firstpage
    Created on : 23/01/2022, 10:34:33
    Author     : RUGGERY
--%>

<%@page import="Model.usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            @font-face{
                font-family: COCOGOOSE;
                src: url('font/cocogoose-webfont.woff');
            }
            a:link {
                color: #979dac;
                background-color: transparent;
                text-decoration: none;
            }
            a:visited {
                color: #979dac;
                background-color: transparent;
                text-decoration: none;
            }
            a:hover {
                color: #001233;
                background-color: transparent;
                text-decoration: underline;
            }
            div{
                color: #979dac; 
                font-family: COCOGOOSE;
            }
            .required:after{
                content:" *";
                color: #33415c;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        session.setAttribute("usuario",(usuario)(request.getAttribute("usuario")));
    %>
    <body bgcolor="#979dac" style="margin-top: 50px"> 
    <center>  
        <div style="box-shadow: 5px 5px 15px rgba(0,0,0,0.4);background-image: linear-gradient(to top, rgba(0,40,85,1), rgba(4,102,200,1));
             width: 450px; height: 650px; border-radius: 20px;">
            <div style="background-color: #001845;width: 450px; height: 150px; border-top-left-radius: 20px; border-top-right-radius: 20px">
                <div style="color: #001233;padding-top:50px; background: #979dac; border: 1px solid white; top: 50%; border-radius: 100%; width: 100px; height: 40px">
                    Sua Foto
                </div>
            </div>

                <div style="padding-top: 10px">Bem-Vindo <%=((usuario)(session.getAttribute("usuario"))).getNome()%></div>
                <div>Aonde gostaria de estacionar hoje?</div><br>

                <div><a href="veiculo"><img src="img/carro.png" width="70px" height="70px">Cadastre seu Veiculo</a></div><br>
                <div><a href="adc_creditos.jsp"><img src="img/credito.png" width="70px" height="70px">Adicione Créditos</a></div><br>
                <div><a href="estacionamento"><img src="img/estacionamento.png" width="70px" height="70px">Estacionamento</a></div><br>
                <div><img src="img/multa.png" width="70px" height="70px">Multas</div>

        </div>
    </center>
</body>
</html>

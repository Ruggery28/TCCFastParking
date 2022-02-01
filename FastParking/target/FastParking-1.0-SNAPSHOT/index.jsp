<%-- 
    Document   : index
    Created on : 12/01/2022, 21:36:48
    Author     : RUGGERY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            @font-face{
                font-family: COCOGOOSE;
                src: url('font/cocogoose-webfont.woff');
            }
            .bt {
                background-color: #33415c;
                border:0px solid #33415c;
                border-radius:20px;
                display:inline-flex;
                cursor:pointer;
                color: #979dac;
                font-family:COCOGOOSE;
                font-size:20px;
                text-decoration:none;
                align-items: center;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <title>Atividade Avaliativa de Diario de Notas</title>
    </head>
    <body bgcolor="#979dac" style="margin-top: 50px">

    <center> 
        <div style="box-shadow: 5px 5px 15px rgba(0,0,0,0.4);background-image: linear-gradient(to top, rgba(0,40,85,1), rgba(4,102,200,1));width: 450px; height: 650px;padding-top: 2px;border-radius: 20px">
            <div style="padding-top: 100px"><img src="img/logotcc.png" width="80%" height="60%"></div>


            <div align="center"  style="padding-top: 120px; text-align: center">                      
                <a href="cadastro" class="bt" style="width:250px; height: 60px">
                    <span style="font-size: 20px; padding-left: 62.5px">CADASTRAR</span>
                </a></div>


            <div align="center" style="padding-top: 50px">
                <a href="login" class="bt" style="width:250px; height: 60px">
                    <span style="font-size: 20px; padding-left: 85px">ENTRAR</span>
                </a></div>  

        </div>
    </center>

</body>
</html>

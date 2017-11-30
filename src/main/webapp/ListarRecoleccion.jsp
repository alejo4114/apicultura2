<%-- 
    Document   : ListarRecoleccion
    Created on : 29/11/2017, 11:40:06 PM
    Author     : Alejandro
--%>

<%@page import="VO.Recoleccion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>About</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
    <meta name="description" content="Your description">
    <meta name="keywords" content="Your keywords">
    <meta name="author" content="Your name">
 	<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/preview.css" type="text/css">
	<script type="text/javascript" src="js/include_script.js"></script>
  	<!--[if lt IE 9]>
	   	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <link href="css/ie.css" rel="stylesheet" type="text/css">
    <![endif]-->
</head>
<body>
<!--content wrapper-->
	<div id="wrapper">
		<section>
			<div class="container">
				<div class="dynamicContent">
					<!--content-->
	               <h1>lista de produccion</h1>
                    <table>
                        <tr>
                            <td>ID_COLMENA</td>
                            <td>KILOS</td>
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Recoleccion> rec = (ArrayList<Recoleccion>) request.getAttribute("lis");

                                if (rec != null) {
                                    for (Recoleccion es: rec) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=es. getId_colmena()%></td>
                            <td><%=es.getKilo_miel()%></td>
                           
                        </tr>
                        
                        

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
                        
				</div>
			</div>
                        
                      
		</section>
                        
                        
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script>
        $(".fancybox").fancybox({});
    </script>
</body>
</html>

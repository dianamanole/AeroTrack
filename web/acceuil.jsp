<%-- 
    Document   : acceuil
    Created on : 4 mars 2018, 07:32:15
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title> AeroTrack</title>
<link rel = "stylesheet" href="style/bootstrap.min.css" rel="stylesheet" media="screen" type = "text/css"/>
<link rel = "stylesheet" href = "style/style.css" type = "text/css"/>
<link rel = "stylesheet" href = "style/styleRows.css" type = "text/css"/>
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Montserrat:400,700|Vollkorn:400italic,700italic,400,700&amp;subset=latin,latin-ext">
<script type="text/javascript" src="js/scrypt.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>

<!-- Begin Acceuil -->
<section class="services-divider" id="serv">
  <div class="row pad-top">
  </div>
  <div class="row">
    <div class="large-4 columns push-2">
         <%
            if (request.getAttribute("message") != null)
            {
              out.println("<span class='erreur'>"+request.getAttribute("message")+"</span>");
            }
        %>    
      <div class="service ">
            <img class="img-services" src="images/services01-01.png" title="" alt="Image non existente">
             <form action = "./Controller?operateur=A"method="post">   
            <input  id ="service1" class = "bService" type="submit" name="ConsulterArrives" value="Consulter" />
             </form>
      </div>
    </div>

  
    <div class="large-4 columns push-2">
      <div class="service ">
	    <img class="img-services" src="images/services01-02.png" title="" alt="Image non existente"/>
              <form action = "./Controller?operateur=D"method="post">    
            <input id ="service1" class = "bService" type="submit" name="ConsulterDepart" value="Consulter" />
              </form>
      </div>
    </div>

  </div>

</section>
<!--Fin section Acceuil-->

<!-- sticky menu function	-->		

</body>
</html>

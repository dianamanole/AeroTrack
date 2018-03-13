<%-- 
    Document   : uploadFileAdministrateur
    Created on : 4 mars 2018, 07:35:04
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>File Upload</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel = "stylesheet" href = "style/style.css" type = "text/css"/>
  <link rel="stylesheet" href="style/navbarStyle.css" type="text/css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
    <div id = "alertes">
        	<div class="navbar" id="menuNav">
				<a id="login" href="acceuil.jsp">DECONNEXION </a>
				<a id="contact" href="enregistrement.jsp">ALERTES SMS / </a>                              
				<a id="services" href="./Controller?operateur=A">ARRIVEES / </a>
				<a id="porfolio" href="./Controller?operateur=D">DEPARTS / </a>
				<a id= "acceuil" href="acceuil.jsp">ACCUEIL / </a>
				<p>
	</div>

 <div id="telechargement">   
      <%     String message=(String)request.getAttribute("message");
    %>       
<%if(message != null){%>
<h4><%=message %></h4>
<%}%>
<div class="container well" >
   <form action = "administrateurs" method="get">
	<div class="form-group">
       <p class = "dialog">Téléchargement</p>
      <input type="file" class="form-control" id="file">
    </div>   
            <input  type = submit id = "telechargeButton" value="Débuter téléchargement" />
    </form>
 
</div>
 </div>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
       <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">          
          <h4 class="modal-title">Téléchargement initié</h4>
        </div>
        </div>
      </div>
      
    </div>
</div>
</body>
</html>


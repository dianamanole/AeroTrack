<%@page import="com.entites.Vol"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
 <%@page import="com.entites.Client"%>
  <%@page import="com.entities.Pays"%>

    <%     String confirmation=(String)request.getAttribute("confirm");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>AeroTrack Alertes SMS</title>
<link rel="stylesheet" href="style/bootstrap.min.css" />
<link rel = "stylesheet" href = "style/autStyle.css" type = "text/css"/>
<link rel="stylesheet" href="style/navbarStyle.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Montserrat:400,700|Vollkorn:400italic,700italic,400,700&amp;subset=latin,latin-ext">
<script type="text/javascript" src="js/scrypt.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
    <div id = "alertes">
<h3>Recevoir des allertes sur votre cellulaire </h3></br>
<p>Recevez instantanément par messagerie texte (SMS) le statut actuel de votre vol</br> ou une alerte pour
 tout changement d'horaire de plus de 10 minutes.</br> Vous pouvez vous inscrire à ce service pratique à 
 l’aide du formulaire ci-dessous. </br>Pour vous inscrire à partir de votre cellulaire, textez simplement 
 votre numéro de vol au 23636.</br> Exemple : Si vous voulez de l'information sur le vol AY123 en provenance 
 de Calgary, envoyez «AY123» au numéro 23636. </p>
<p>Taux standard de messagerie texte applicables.</p></br>
<div class="container" style="margin-top: 100px">
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
      <div class="panel panel-default">
        <h3>Inscription</h3>
      </br>
        <div class="panel-body">
          <form method="post" action="EnregistrementClient">
            <div class="form-group">
				<input type="text" name="numeroVol" class="form-control"  placeholder="Ex.: 5143847965">
            </div>
            <div class="form-group">
				<input type="text" name="numeroTelephone" class="form-control" placeholder="Ex.: AY123">
            </div>
            <div class="form-group">
				<input type="submit" class="btn btn-succes btn-lg btn-block" value="Inscription" />
            </div>

          </form>
        </div>
        <div class="lock"><i class="fa fa-lock fa-3x"></i>
        </div>
      </div>
    </div>
  </div>
</div> 
<div class="popup" onclick="myFunction()"> <h5>Termes et conditions</h5></br>
  <span class="popuptext" id="myPopup">Les renseignements reçus du service information de vols par SMS demeurent en tout temps sujets à modification
 sans préavis. Nous ne garantissons pas que ces renseignements sont exacts, complets et à jour. 
 Nous ne sommes pas responsables des dommages causés directement ou indirectement de par l'utilisation
  ou par l'impossibilité de l'utilisation d'information de vols par SMS. Taux standard de messagerie texte 
  applicables.</span>
</div> 

<script>
// When the user clicks on <div>, open the popup
function myFunction() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
}
</script>

<%if(confirmation!=null){%>
<h4><%=confirmation %></h4>
<%}%>
</div>
</body>
</html>
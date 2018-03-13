<%-- 
    Document   : login
    Created on : 4 mars 2018, 07:33:57
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!Doctype HTML>
<html>
<Head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel = "stylesheet" href="style/bootstrap.min.css" rel="stylesheet" media="screen" type = "text/css"/>
<link rel = "stylesheet" href = "style/autStyle.css" type = "text/css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="style/navbarStyle.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Montserrat:400,700|Vollkorn:400italic,700italic,400,700&amp;subset=latin,latin-ext">
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/scrypt.js"></script>
<title> Authentification</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container" style="margin-top: 100px">
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
      <div class="panel panel-default">
        <h3>Authentification</h3>
      </br>
        <div class="panel-body">
          <form action = "login" method="get">
            <div class="form-group">
				<input type="text" name="id" class="form-control" value="root" placeholder="Votre id">
            </div>
            <div class="form-group">
				<input type="password" name="password" class="form-control" value="root" placeholder="Votre mot de passe ">
            </div>
            <div class="form-group">
				<input type="submit" name="bConnecter" class="btn btn-succes btn-lg btn-block" value="Connexion" />
            </div>
          </form>
        </div>
        <div class="lock"><i class="fa fa-lock fa-3x"></i>
        </div>
      </div>
    </div>
  </div>
</div> 
<!--Connexion a BD validation de l'identification-->

</body>
</html>

>
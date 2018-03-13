<%-- 
    Document   : afficherVols
    Created on : 2018-03-05, 11:04:39
    Author     : usager
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.concurrent.TimeUnit"%>
<%@page import="java.util.Date"%>
<%@page import="com.entites.Vol"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<Vol> mesVols = (ArrayList<Vol>) session.getAttribute("mesVols");
        ArrayList<Vol> mesVolsJours;
       
%>
        
<%     String message=(String)request.getAttribute("message");
%>
<%java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
<%Date tomowor = new Date(new Date().getTime() + 60*60*24*1000);%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Affichege vols AeroTrack</title>
<link rel="stylesheet" href="css/style.default.css" type="text/css" />
<link rel="stylesheet" href="css/responsive-tables.css">
<link rel = "stylesheet" href = "style/style.css" type = "text/css"/>
<link rel = "stylesheet" href="css/bootstrap.min_1.css" rel="stylesheet" media="screen" type = "text/css"/>
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Montserrat:400,700|Vollkorn:400italic,700italic,400,700&amp;subset=latin,latin-ext">
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/jquery-migrate-1.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.9.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.uniform.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/modernizr.min.js"></script>
<script type="text/javascript" src="js/responsive-tables.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		// dynamic table
		jQuery('#dyntable').dataTable({
			"sPaginationType" : "full_numbers",
			"aaSortingFixed" : [ [ 0, 'asc' ] ],
			"fnDrawCallback" : function(oSettings) {
				jQuery.uniform.update();
			}
		});

		jQuery('#dyntable2').dataTable({
			"bScrollInfinite" : true,
			"bScrollCollapse" : true,
			"sScrollY" : "300px"
		});

	});
</script>
</head>
<body>
<jsp:include page="header.jsp"/>
    <div id ="affichageVol">
<%if(message!=null){%>
<h4 id="message"><%=message %></h4>
<%}%>
	<div class="mainwrapper">
            <div class = "rechercherButton">
            <form action = "./Controller?operateur=J"method="post">                  
               <input id ="filtrer" class = "bService" type="submit" name="ConsulterDepart" value="AUJOURD'HUI - <%= df.format(new java.util.Date()) %>" />
              </form>
            </div>
            <div class = "rechercherButton">
            <form action = "./Controller?operateur=L"method="post">    
               <input id ="filtrer" class = "bService" type="submit" name="ConsulterDepart" value="DEMAIN  - <%= df.format(tomowor)%>" />
             </form>
            </div>
		<table id="dyntable" class="table table-bordered responsive">
			<colgroup>
				<col class="con1" />
				<col class="con0" />
				<col class="con1" />
				<col class="con0" />
				<col class="con1" />
                                <col class="con1" />
			</colgroup>
			<thead>
				<tr>
                                    	<th class="head0">Date vole</th>
                                        <th class="head0">Heure prévu</th>
					<th class="head0">Compagnie</th>
                                        <th class="head0">Numero de vol</th>
					<th class="head1">Ville</th>
                                        <th class="head1">Type de Vol</th>

				</tr>

			</thead>
			<tbody>
				<%
                                     if(request.getAttribute("afficherJour")!= null){
                                        mesVolsJours = (ArrayList<Vol>) request.getAttribute("mesVolsJour");
					
						for (Vol v : mesVolsJours) {
				%>
						<tr>
							<td><%= v.getDateVol()%></td>
                                                        <td><%= v.getHeurePrevueVol()%></td>
							<td><%=v.getNomCompagnie()%></td>
                                                        <td><%=v.getNumeroVol()%></td>
                                                        <td><%=v.getDestinationVol()%></td>
                                                        <td><%=v.getTypeVol()%></td>
						</tr>
				<%
						}
                                        }
                                        else if (mesVols != null) {
                                           for (Vol v : mesVols) {
				%>
						<tr>
							<td><%= v.getDateVol()%></td>
                                                        <td><%= v.getHeurePrevueVol()%></td>
							<td><%=v.getNomCompagnie()%></td>
                                                        <td><%=v.getNumeroVol()%></td>
                                                        <td><%=v.getDestinationVol()%></td>
                                                        <td><%=v.getTypeVol()%></td>
						</tr>
				<%
						}

                                                }
					
				%>


			</tbody>
		</table>
	</div>
   </div>
</body>
</html>

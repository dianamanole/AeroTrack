package com.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.ServiceAction;
import com.services.VolsService;

/**
 * Servlet implementation class EnregistrementClient
 */
@WebServlet("/EnregistrementClient")
public class EnregistrementClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Pattern PATTERN = Pattern.compile( "^(1\\\\)?[0-9]{3}\\\\?[0-9]{3}\\\\?[0-9]{4}$" ); 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnregistrementClient() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone=request.getParameter("numeroTelephone").replace("-","").
				replace("(","").replace(")","").replace(":","").trim();
		String vol=request.getParameter("numeroVol");
		if(phone!=null&&vol!=null) {				
			//if(isNumber(phone)) {
			//	int phoneNum=Integer.parseInt(phone);
			if(isNumeric(phone)){
				request.setAttribute("confirm", "Vous allez recevoir une demande de confirmation sur votre cellulaire."
						+ " Veuille juste repondre oui pour valider votre demander de suivi du vol."
						+ " Ou non si vous ne voulez pas recevoir des notification  ");
				ServiceAction.enregistreClient(request,response,phone,vol); // il entre mais il y a une probleme avec l`insert ...verifier!!!
                                request.getRequestDispatcher("./enregistrement.jsp").forward(request, response);
                                
		}
                else {
                    request.setAttribute("confirm","Le numéro de téléphone rentré ne respecte pas le format 514-1111111 ou 5141111111 ou 1-514-1111111");
                    request.getRequestDispatcher("./enregistrement.jsp").forward(request, response);
                }}
                else {
                        request.setAttribute("confirm","Veuillez ramplir tous les champs!");
                        request.getRequestDispatcher("./enregistrement.jsp").forward(request, response);
                        }
        }
    private boolean isNumeric(String value) {
        {
            return true;
	    //return value != null && PATTERN.matcher( value ).matches();
	}    
    }

/*	private static boolean isNumber(final String value) {
	    for (int i = 0; i < value.length(); i++) {
	        if(!Character.isDigit(value.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}  */

    private boolean volExist(String vol) {
        boolean bol=false;
        if(VolsService.existeVol(vol))
            bol=true;
            return bol;
    }
}	

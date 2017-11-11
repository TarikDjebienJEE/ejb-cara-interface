package com.miage.ejb.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.miage.ejb.IUtilisateurServiceRemote;

public class UserAlreadyExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAlreadyExistException(String nom) {
		Logger.getLogger(IUtilisateurServiceRemote.class.getName()).log(
				Level.WARNING, 
				"L'utilisateur "+nom+" existe deja dans la salle de vente", 
				this
				);
	}

}

package com.miage.ejb.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.miage.ejb.IUtilisateurServiceRemote;

public class UserBadLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserBadLoginException(String nom, String password) {
		Logger.getLogger(IUtilisateurServiceRemote.class.getName()).log(
				Level.SEVERE, 
				"L'authentification "+nom+" avec le mot de passe "+password+" est invalide.", 
				this
				);
	}
}

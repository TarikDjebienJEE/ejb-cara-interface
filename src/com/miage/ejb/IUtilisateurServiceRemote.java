package com.miage.ejb;

import javax.ejb.Remote;

import com.miage.ejb.exception.UserAlreadyExistException;
import com.miage.ejb.exception.UserBadLoginException;
import com.miage.entity.User;

/**
 * Interface pour les services sur les utilisateurs
 * @author tarik
 * @author Eric
 */
@Remote
public interface IUtilisateurServiceRemote {

	/**
	 * Un utilisateur peut s’inscrire auprès de la salle des ventes aux enchères. 
	 * Pour cela, il doit se connecter à la salle et fournir son nom, son adresse postale, 
	 * son adresse électronique ainsi qu’un mot de passe. 
	 * La salle des ventes doit vériﬁer qu’il n’existe pas deux utilisateurs ayant le même nom.
	 * 
	 * @param nom
	 * @param adresse
	 * @param mail
	 * @param password
	 * @return
	 * @throws UserAlreadyExistException
	 */
	User inscrire(String nom, String adresse, String mail, String password) throws UserAlreadyExistException;
	
	/**
	 * Un utilisateur doit s'identiﬁer auprès de la salle des ventes pour pouvoir vendre ou acheter des articles. 
	 * Pour cela, l’application de l’utilisateur envoie son nom et son mot de passe qui sont alors vériﬁés 
	 * par la salle. Si le nom et/ou le mot de passe sont incorrects, une erreur est retournée à l’application 
	 * cliente sinon une référence sur l’objet représentant l’utilisateur au sein du serveur de la salle 
	 * des ventes est retournée. Cet objet permet alors à l’utilisateur de proposer des articles à la 
	 * vente ou des enchères sur des articles en vente.
	 * 
	 * @param nom
	 * @param password
	 * @return
	 * @throws UserBadLoginException
	 */
	User identifier(String nom, String password) throws UserBadLoginException;
	
	
	/**
	 * Après s'être identifié, un utilisateur peut consulter la liste des articles en cours de vente, 
	 * en sélectionner un, consulter
	 * l’enchère courante et proposer une nouvelle enchère. 
	 * La salle des ventes vérifiera que le montant de l’enchère proposée est supérieur `à la dernière enchère 
	 * (ou au montant minimal désiré par le vendeur. Si le montant est incorrect alors une erreur est
	 * retournée sinon la salle mémorise que tel acheteur a proposé tel montant pour l’article.
	 * @param nomAcheteur
	 * @param idArticle
	 */
	void surrencherir(String nomAcheteur, Long idArticle , Float montantDerniereEnchere) ;	
}

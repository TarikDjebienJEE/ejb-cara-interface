package com.miage.ejb;
import java.util.List;

import javax.ejb.Remote;

import com.miage.entity.Article;

/**
 * Interface pour les services sur les articles
 * @author tarik
 * @author Eric
 */
@Remote
public interface IArticleServiceRemote {

	/**
	 * 
	 * Proposition d’un article à la vente
	 * Après s'être identifié, un utilisateur peut proposer un article à la vente. 
	 * L’article est alors décrit par un texte et un montant
	 * minimal de vente. En retour, la salle des ventes crée un objet article, 
	 * lui associe un identifiant unique et conserve le lien entre
	 * l’utilisateur vendeur et l’article mis à la vente.
	 * Proposition d’une enchère
	 * @param description
	 * @param prixVente
	 * @return
	 */
	Article ajouterArticle(String nomVendeur, String description, Float prixVente);
	
	
	/**
	 * 
	 * Recupere tous les articles mis en vente
	 * @return la liste des articles
	 */
	List<Article> getAllArticlesEnVente();	
	
}

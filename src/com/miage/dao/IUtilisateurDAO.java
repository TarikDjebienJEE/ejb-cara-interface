package com.miage.dao;

import java.util.List;

import javax.ejb.Remote;

import com.miage.entity.User;

/**
 * Interface pour les CRUD sur les utilisateurs
 * @author tarik
 * @author Eric
 */
@Remote
public interface IUtilisateurDAO {
	
	/**
     * Find an entity by its unique id as primary key
     * @param id the primary key
     * @return the entity
     */
    User findById(final String idNom);

    /**
     * Load all entities
     * @return the list of entities
     */
    List<User> findAll();
    


    /**
     * Count all entities
     * @return the number of entities
     */
    int countAll();

    
    /**
     * Save an entity. This can be either a insert or update
     * @param entity the entity to save
     * @return the saved entity
     */
    User save(final User entity);

    /**
     * Delete an entity from the database
     * @param entity the entity to delete
     */
    void delete(final User entity);
}

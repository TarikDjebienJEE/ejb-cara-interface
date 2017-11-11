package com.miage.dao;
import java.util.List;
import javax.ejb.Remote;
import com.miage.entity.Article;

/**
 * Interface pour les CRUD sur les articles
 * @author tarik
 * @author Eric
 */
@Remote
public interface IArticleDAO{
	
    /**
     * Find an entity by its unique id as primary key
     * @param id the primary key
     * @return the entity
     */
    Article findById(final Long id);

    /**
     * Load all entities
     * @return the list of entities
     */
    List<Article> findAll();
    


    /**
     * Count all entities
     * @return the number of entities
     */
    int countAll();

    
    /**
     * Save an entity. This can be either a INSArticleRT or UPDATArticle in the database
     * @param entity the entity to save
     * @return the saved entity
     */
    Article save(final Article entity);

    /**
     * Delete an entity from the database
     * @param entity the entity to delete
     */
    void delete(final Article entity);
}

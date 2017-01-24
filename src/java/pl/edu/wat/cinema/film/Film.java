/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.wat.cinema.film;

/**
 *
 * @author Damian
 */
public class Film {
    
    private Short film_id;
    private String title;
    private String description;
    
   public Film(){
   }

    public Film(String title, String description) {
        
        this.title = title;
        this.description = description;
    }

    public Short getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Short film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

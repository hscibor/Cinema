/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.wat.cinema.film;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pl.edu.wat.cinema.util.HibernateUtil;

/**
 *
 * @author Damian
 */
public class FilmHelper {


    Session session;

    public FilmHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getFilmTitles(int startID, int endID) {
        List<Film> filmList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Film as films where films.film_id between '" + startID +"' and '" + endID + "'");
            filmList = (List<Film>) q.list();
        } catch (Exception e) {
        }
        return filmList;

    }
    
     public Film getFilmByID(int film_id) {

        Film film = null;

        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Films where film_id=" + film_id);
            film = (Film) q.uniqueResult();
        } catch (Exception e) {
        }

        return film;
    }

   
}
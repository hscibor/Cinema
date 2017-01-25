/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.wat.cinema.film;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Damian
 */
@ManagedBean
@SessionScoped
public class FilmController {

    int startId= 1;
    int endId =10;
    DataModel filmTitles;
    FilmHelper helper;
    public int recordCount = 1000;
    public int pageSize = 10;
    private Film current;
    private int selectedItemIndex;

    public FilmController() {
        
    }

    public FilmController(int startId, int endId) {
        helper = new FilmHelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Film getSelected() {
        if (current == null) {
            current = new Film();
            selectedItemIndex = -1;
        }
        return current;
    }

    public boolean isHasNextPage() {
        return endId + pageSize <= recordCount;
    }

    public boolean isHasPreviousPage() {
        return startId - pageSize > 0;
    }

    void recreateModel() {
        filmTitles = null;
    }

    public String next() {
        startId = endId + 1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView() {
        current = (Film) getFilmTitles().getRowData();
        return "browse";

    }

    public String prepareList() {
        recreateModel();
        return "index";
    }

    public DataModel getFilmTitles() {
        if (filmTitles != null) {
        } else {
            filmTitles = new ListDataModel(new FilmHelper().getFilmTitles(startId, endId));
        }
        return filmTitles;
    }

}

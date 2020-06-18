/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author KelvinVicenteCosta
 */
public class Data {
    
    private String title;
    private String year;
    private String imbdID;

    public Data(String title, String year, String imbdID) {
        this.title = title;
        this.year = year;
        this.imbdID = imbdID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImbdID() {
        return imbdID;
    }

    public void setImbdID(String imbdID) {
        this.imbdID = imbdID;
    }
    
}

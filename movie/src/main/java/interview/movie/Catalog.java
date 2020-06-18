/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author KelvinVicenteCosta
 */

public class Catalog {    
    
    RestTemplate restTemplate = new RestTemplate();
    private final String URL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
    private String substr;

    public Catalog(String substr) {
        this.substr = substr;
    }
    
    Object getMovies() {
        Object response = restTemplate.getForObject(URL + substr, Object.class);
        return response;
    }
    
    public String getSubstr() {
        return substr;
    }

    public void setSubstr(String substr) {
        this.substr = substr;
    }
    
}

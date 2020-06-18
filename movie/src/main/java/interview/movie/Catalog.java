/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author KelvinVicenteCosta
 */

public class Catalog {    
    
    RestTemplate restTemplate = new RestTemplate();
    private final String URL = "https://jsonmock.hackerrank.com/api/movies/search/";
    
    Object getMovies(String substr, String pageNumber) {
        String searchedUrl = URL + "?Title=" + substr + "&page=" + pageNumber;
        Object response = restTemplate.getForObject(searchedUrl, Object.class);
        return response;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author KelvinVicenteCosta
 */
@RestController
@RequestMapping("/filmes")
public class Catalog {    
    
    RestTemplate restTemplate = new RestTemplate();
    private final String URL = "https://jsonmock.hackerrank.com/api/movies/search/";
    
    private Object getMovies(String substr, String pageNumber) {
        String searchedUrl = URL + "?Title=" + substr + "&page=" + pageNumber;
        Object response = restTemplate.getForObject(searchedUrl, Object.class);
        return response;
    }
    
    @RequestMapping("/{movieName}")
    public Object showMovie (@PathVariable("movieName") String movieName) {
        return getMovies(movieName, "1");
    }
    
    @RequestMapping("/{movieName}/{pageNumber}")
    public Object movieAndPage(
            @PathVariable("movieName") String movieName, 
            @PathVariable("pageNumber") String pageNumber) {        
        return getMovies(movieName, pageNumber);
    }
    
}

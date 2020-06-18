/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author KelvinVicenteCosta
 */

@RestController
public class Resource {    
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=Waterworld";
    
    @RequestMapping("/filmes")
    Object getMovies() {
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
    
}

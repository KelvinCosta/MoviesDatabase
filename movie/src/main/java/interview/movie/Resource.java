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
@RequestMapping("/filmes")
public class Resource {    
    
    RestTemplate restTemplate = new RestTemplate();
    
    Object getMovies() {
        Object response = restTemplate.getForObject("https://jsonmock.hackerrank.com/api/movies/search/?Title=Waterworld", Object.class);
        return response;
    }
    
}

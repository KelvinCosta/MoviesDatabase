/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KelvinVicenteCosta
 */

@RestController
@RequestMapping("/filmes")
public class Control {
    
    Catalog catalog = new Catalog();
    
    @RequestMapping("/{movieName}")
    public Object showMovie (@PathVariable("movieName") String movieName) {
        return catalog.getMovies(movieName, "1");
    }
    
    @RequestMapping("/{movieName}/{pageNumber}")
    public Object movieAndPage(
            @PathVariable("movieName") String movieName, 
            @PathVariable("pageNumber") String pageNumber) {        
        return catalog.getMovies(movieName, pageNumber);
    }
    
}

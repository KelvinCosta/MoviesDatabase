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
    
    @RequestMapping("/{movieName}")
    public Object showResponse(@PathVariable("movieName") String movieName){
        return new Catalog(movieName).getMovies();
    }
    
}

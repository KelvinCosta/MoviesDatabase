/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author KelvinVicenteCosta
 */

@WebMvcTest
public class CatalogTest {
    
    @Autowired
    MockMvc mockMvc;
    	
    @Test
    public void showMovieTest() throws Exception{
        this.mockMvc.perform(get("/filmes/waterworld"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.page", is("1")))
                .andExpect(jsonPath("$.data[0]").exists())
                .andExpect(jsonPath("$.data[2]").exists());
    }
    
    @Test
    public void showMovieAndPageTest() throws Exception{
        this.mockMvc.perform(get("/filmes/waterworld/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.page", is("2")))
                .andExpect(jsonPath("$.data[0]").exists())
                .andExpect(jsonPath("$.data[1]").doesNotExist());
    }
}

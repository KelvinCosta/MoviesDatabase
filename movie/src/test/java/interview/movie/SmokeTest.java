/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.movie;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author KelvinVicenteCosta
 */
@SpringBootTest
public class SmokeTest {
    
    @Autowired
    private Catalog catalog;
    
    @Test
    public void contextLoads() {
        assertThat(catalog).isNotNull();
    }
    
}

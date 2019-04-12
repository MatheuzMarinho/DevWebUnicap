package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.model.Disciplina;
import com.example.demo.model.dao.DisciplinaDao;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
	public class TesteInserirProfessor {
	
	
	@MockBean
    private DisciplinaDao superHeroRepository;
	
    @Autowired
    private TestRestTemplate restTemplate;
    
    
    @Test
    public void canRetrieveByIdWhenExists() {
    	boolean a;
        // given
        given(superHeroRepository.findByCodigo("INF1200"))
                .willReturn(new Disciplina("INF1203","LÓGICA MATEMÁTICA",60));

        // when
        ResponseEntity<Disciplina> superHeroResponse = restTemplate.getForEntity("/disciplina/INF1200", Disciplina.class);

        // then
       // assertThat(superHeroResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        a = superHeroResponse.getBody().equals(new Disciplina("INF1203","LÓGICA MATEMÁTICA",60));
        assertThat(a, is(true));
    
    }
    
    @Test
    public void canCreateANewSuperHero() {
        // when
        ResponseEntity<?> superHeroResponse = restTemplate.postForEntity("/disciplina/",
                new Disciplina("INF1200","LÓGICA MATEMÁTICA",60), Disciplina.class);

        // then
        assertThat(superHeroResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}

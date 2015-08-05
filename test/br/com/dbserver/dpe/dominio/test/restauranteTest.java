package br.com.dbserver.dpe.dominio.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.dbserver.dpe.domain.restaurantes.IRestauranteRepositorio;
import br.com.dbserver.dpe.domain.restaurantes.Restaurante;

public final class restauranteTest {

	@Mock
	IRestauranteRepositorio restauranteRepositorioMock;
		
	@Before
	public void init(){
	    MockitoAnnotations.initMocks(this);
	   
	    List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		Restaurante maza = new Restaurante("maza", "bento");
		//maza.setDataDaUltimaVitoria();
		restaurantes.add(maza);
		restaurantes.add(new Restaurante("novo sabor", "bento"));
		restaurantes.add(new Restaurante("50", "puc"));	
		
		Mockito.when(restauranteRepositorioMock.todos()).thenReturn(restaurantes);
	}

	@Test
	public void deve_listar_somente_restaurantes_que_nao_venceram_na_semana_corrente() {
		// 1. Montar cenário
		// Criar lista de restaurantes
		
		
		List<Restaurante> _restaurantes = restauranteRepositorioMock.todos();
		LocalDate teste = LocalDate.now().withDayOfMonth(-1);
		// 2. Executar ação
		assertNotNull(teste);
		
		// 3. Validar o resultado
	}

}

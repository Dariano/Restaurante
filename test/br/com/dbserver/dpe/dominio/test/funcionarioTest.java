package br.com.dbserver.dpe.dominio.test;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.dbserver.dpe.domain.profissionais.Profissional;
import br.com.dbserver.dpe.domain.restaurantes.Restaurante;
import br.com.dbserver.dpe.domain.votos.Voto;
import br.com.dbserver.dpe.infrastructure.repositorios.VotosRespositorio;
import junit.framework.AssertionFailedError;
import br.com.dbserver.dpe.domain.votos.IVotosRepositorio;
import br.com.dbserver.dpe.domain.votos.UrnaService;

public class funcionarioTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@AfterClass
	public static void setUpAfterClass() throws Exception {
		
	}

	@Test
	public void deve_votar_no_restaurante_favorito() throws Exception {
		
		// 1 . Prepara o Cenário
		Profissional dariano = new Profissional("dariano");
		Restaurante maza = new Restaurante("Maza", "Bento");
		
		Voto voto = new Voto(dariano, maza);
		IVotosRepositorio votos = new VotosRespositorio();
		UrnaService urna = new UrnaService(votos);
		
		// 2. Execura a Ação		
		urna.Recebe(voto);	
		
		// 3. Valida o resultado
		UUID atual = voto.getId();
		UUID experado = votos.obterPeloId(voto.getId()).getId();

		assertEquals(experado, atual);
	}
	
	// Usar uma exception mais apropriada.
	@Test(expected = Exception.class) 
	public void deve_votar_somente_uma_vez_por_dia() throws Exception{
		// 1 . Prepara o Cenário
		Profissional dariano = new Profissional("dariano");
		Restaurante maza = new Restaurante("Maza", "Bento");
		
		Voto voto = new Voto(dariano, maza);
		IVotosRepositorio votos = new VotosRespositorio();
		UrnaService urna = new UrnaService(votos);
		
		// 2. Execura a Ação		
		urna.Recebe(voto);	
		
		// 3. Valida o resultado		
		urna.Recebe(voto);	
	}
	
}

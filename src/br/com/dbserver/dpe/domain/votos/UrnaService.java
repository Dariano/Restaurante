package br.com.dbserver.dpe.domain.votos;

import java.util.NoSuchElementException;

public class UrnaService {
	
	private IVotosRepositorio votos;
	
	public UrnaService(IVotosRepositorio votos) {
		this.votos = votos;
	}

	public void Recebe(Voto voto) throws Exception {

		boolean jaVotou = this.votos.todos().stream().anyMatch(v -> {
			return v.getFuncionario().getId() == voto.getFuncionario().getId()
					&& v.getData() == voto.getData();
		});
		
		if(jaVotou) throw new Exception("Funcionário já votou nesse periodo.");
		
		this.votos.adicionar(voto);		
	}	

}

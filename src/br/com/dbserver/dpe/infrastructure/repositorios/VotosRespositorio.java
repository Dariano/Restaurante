package br.com.dbserver.dpe.infrastructure.repositorios;


import java.util.List;
import java.util.UUID;

import br.com.dbserver.dpe.domain.votos.IVotosRepositorio;
import br.com.dbserver.dpe.domain.votos.Voto;
import br.com.dbserver.dpe.infrastructure.dadosEmMemoria.VotoEmMemoria;

public class VotosRespositorio implements IVotosRepositorio {
	
	public VotosRespositorio() {	
	}
	
	@Override
	public Voto obterPeloId(UUID id) {		
		return VotoEmMemoria.getVotos().stream()
			 .filter(voto -> {
				 return voto.getId() == id;
			 })
			 .findFirst()
			 .get();
	}

	@Override
	public void adicionar(Voto voto) {
		VotoEmMemoria.getVotos().add(voto);		
	}

	@Override
	public void remover(Voto voto) {
		VotoEmMemoria.getVotos().remove(voto);
		
	}

	@Override
	public List<Voto> todos() {
		return VotoEmMemoria.getVotos();
	}

}

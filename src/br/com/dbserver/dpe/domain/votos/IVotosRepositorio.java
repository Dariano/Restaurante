package br.com.dbserver.dpe.domain.votos;

import java.util.List;
import java.util.UUID;

public interface IVotosRepositorio {
	
	Voto obterPeloId(UUID id);
	void adicionar(Voto voto);
	void remover(Voto voto);
	List<Voto> todos();
}


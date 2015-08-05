package br.com.dbserver.dpe.domain.restaurantes;

import java.util.List;
import java.util.UUID;

public interface IRestauranteRepositorio {
	Restaurante obterPeloId(UUID id);
	void adicionar(Restaurante restaurante);
	void remover(Restaurante restaurante);
	List<Restaurante> todos();
}

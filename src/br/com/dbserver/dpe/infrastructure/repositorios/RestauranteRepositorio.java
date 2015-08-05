package br.com.dbserver.dpe.infrastructure.repositorios;

import java.util.List;
import java.util.UUID;

import br.com.dbserver.dpe.domain.restaurantes.IRestauranteRepositorio;
import br.com.dbserver.dpe.domain.restaurantes.Restaurante;
import br.com.dbserver.dpe.infrastructure.dadosEmMemoria.RestaurantesEmMemoria;
import br.com.dbserver.dpe.infrastructure.dadosEmMemoria.VotoEmMemoria;

public class RestauranteRepositorio implements IRestauranteRepositorio {

	@Override
	public Restaurante obterPeloId(UUID id) {
		return RestaurantesEmMemoria.todos().stream()
				 .filter(r -> {
					 return r.getId() == id;
				 })
				 .findFirst()
				 .get();
	}

	@Override
	public void adicionar(Restaurante restaurante) {
		RestaurantesEmMemoria.adicionar(restaurante);
	}

	@Override
	public void remover(Restaurante restaurante) {
		RestaurantesEmMemoria.remover(restaurante);		
	}

	@Override
	public List<Restaurante> todos() {
		return RestaurantesEmMemoria.todos();
	}

}

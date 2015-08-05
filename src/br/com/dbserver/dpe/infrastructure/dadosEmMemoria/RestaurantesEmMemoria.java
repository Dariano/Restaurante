package br.com.dbserver.dpe.infrastructure.dadosEmMemoria;

import java.util.ArrayList;
import java.util.List;

import br.com.dbserver.dpe.domain.restaurantes.Restaurante;

public final class RestaurantesEmMemoria {
	
	private static final List<Restaurante> restaurantes = new ArrayList<Restaurante>();
	
	public static void adicionar(Restaurante restaurante) {
		restaurantes.add(restaurante);
	}
	
	public static void remover(Restaurante restaurante) {
		restaurantes.remove(restaurante);
	}
	
	public static List<Restaurante> todos() {
		return restaurantes;
	}
}

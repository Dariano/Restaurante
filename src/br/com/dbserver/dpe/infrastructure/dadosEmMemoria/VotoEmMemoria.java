package br.com.dbserver.dpe.infrastructure.dadosEmMemoria;

import java.util.ArrayList;
import java.util.List;

import br.com.dbserver.dpe.domain.votos.Voto;

public final class VotoEmMemoria {

	private static final List<Voto> votos = new ArrayList<Voto>();
	
	public static List<Voto> getVotos() {
		return votos;
	}
	
	public static void adicionar(Voto voto) {
		votos.add(voto);
	}	
	
	public static void remover(Voto voto) {
		votos.remove(voto);
	}
	
	public void liparTudo() {
		votos.clear();
	}
}

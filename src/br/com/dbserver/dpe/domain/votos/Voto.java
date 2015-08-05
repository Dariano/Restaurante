package br.com.dbserver.dpe.domain.votos;

import java.time.LocalTime;
import java.util.UUID;

import br.com.dbserver.dpe.domain.profissionais.Profissional;
import br.com.dbserver.dpe.domain.restaurantes.Restaurante;

public class Voto {

	private UUID id;
	private Profissional profissional;
	private Restaurante restaurante;
	private LocalTime data;
	
	public Voto(Profissional profissional, Restaurante restaurante) {
		this.id = UUID.randomUUID();
		this.profissional = profissional;
		this.restaurante = restaurante;
		this.data = LocalTime.now();
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public Profissional getFuncionario() {
		return this.profissional;
	}
	
	public Restaurante getRestaurante() {
		return this.restaurante;
	}
	
	public LocalTime getData() {
		return this.data;
	}
	
}

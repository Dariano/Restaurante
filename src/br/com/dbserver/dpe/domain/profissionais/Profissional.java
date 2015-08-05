package br.com.dbserver.dpe.domain.profissionais;

import java.util.UUID;

public class Profissional {

	private UUID id;
	private String nome;
	
	public Profissional(String nome){
		this.id = UUID.randomUUID();
		this.nome = nome;
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
}

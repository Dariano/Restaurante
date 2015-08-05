package br.com.dbserver.dpe.domain.restaurantes;

import java.time.LocalTime;
import java.util.UUID;

public class Restaurante {
	
	private UUID id;
	private String nome;
	private String endereco;
	private LocalTime dataDaUltimaVitoria;
	
	public Restaurante(String nome, String endereco){
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setDataDaUltimaVitoria(LocalTime dataDaUltimaVitoria) {
		this.dataDaUltimaVitoria = dataDaUltimaVitoria;
	}
	
	public LocalTime getDataDaUltimaVitoria() {
		return dataDaUltimaVitoria;
	}
}

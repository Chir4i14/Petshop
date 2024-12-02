package com.senaidev.cadastroCliente.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public String nome;
	public String tipo;
	public String raca;
	public int idade;
	//cliente id(não sei como faz para "puxar")//
	
	//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//tipo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//raca
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	//idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//id do cliente//
}

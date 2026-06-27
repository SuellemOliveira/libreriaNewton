package com.libreriaNewton.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity



public class Libreria {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String nome;
    private String Autore;
    private String prezzo;
    
	public Libreria(int id, String nome, String autore, String prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		Autore = autore;
		this.prezzo = prezzo;
	}

	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
    
	
	
    
}

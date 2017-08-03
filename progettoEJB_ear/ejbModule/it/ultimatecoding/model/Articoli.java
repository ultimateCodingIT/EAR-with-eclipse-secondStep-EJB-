package it.ultimatecoding.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Articoli {
	
	@Id
	private int id;
	private String nomeArticolo;
	private String testArticolo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArticolo() {
		return nomeArticolo;
	}
	public void setNomeArticolo(String nomeArticolo) {
		this.nomeArticolo = nomeArticolo;
	}
	public String getTestArticolo() {
		return testArticolo;
	}
	public void setTestArticolo(String testArticolo) {
		this.testArticolo = testArticolo;
	}
	
	

}

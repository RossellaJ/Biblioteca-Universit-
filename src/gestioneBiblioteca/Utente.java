package gestioneBiblioteca;

import gestioneUniversità.ValidaDato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utente implements ValidaDato{
	
//	private String nome;
//	private String cognome;
	
	protected String nome;
	protected String cognome;
	protected String cF;
	
	private List<Libro>libriRilevati =new ArrayList <Libro>();
	private int copieRilevate;    

	
	
	// getter setter

	public String getcF() {
		return cF;
	}
	
	public void setcF(String cF) {
		this.cF = cF;
	}
	
	public int getCopieRilevate() {
		return copieRilevate;
	}
	public void setCopieRilevate(int copieRilevate) {
		this.copieRilevate = copieRilevate;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//costruttore
	
	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	public List<Libro> getLibriRilevati() {
		return libriRilevati;
	}
	public void setLibriRilevati(List<Libro> libriRilevati) {
		this.libriRilevati = libriRilevati;
	}
	
	
	
	@Override
	public boolean isValid() {

		boolean risultato=false;
		if((!nome.isEmpty() && nome!=null) && (!cognome.isEmpty() && cognome!=null)){
		risultato=true;			
		}
		return risultato;
	}
	
	

}

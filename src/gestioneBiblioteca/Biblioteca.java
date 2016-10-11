package gestioneBiblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
	
	private String nomeBiblioteca;
	
	private List<Libro> libri =new ArrayList<Libro>();
	private List<Utente> utenti =new ArrayList<Utente>();
	private List<Libro> libriPrestati =new ArrayList<Libro> ();
	
	

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	
	
	public List<Utente> getUtenti() {
		return utenti;
	}
	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}

	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}
	
	
	public Biblioteca(String nomeBiblioteca) {
		super();
		this.nomeBiblioteca = nomeBiblioteca;
	}

	public List<Libro> getLibriPrestati() {
		return libriPrestati;
	}

	public void setLibriPrestati(List<Libro> libriPrestati) {
		this.libriPrestati = libriPrestati;
	}
	


}

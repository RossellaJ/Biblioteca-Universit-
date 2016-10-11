package gestioneUniversit�;

import java.util.ArrayList;
import java.util.List;

public class Universit� {
	
	private String nome;
	
	private List<Studente> listaStudenti=new ArrayList<Studente>();
	private List<Docente> listaDocente=new ArrayList<Docente>();
	private List<Corso> listaCorso=new ArrayList<Corso>();
	
	
	
	
	

	//costruttore
	public Universit�(String nome) {
		this.nome = nome;
	}
	
	
	// getter setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Docente> getListaDocente() {
		return listaDocente;
	}


	public void setListaDocente(List<Docente> listaDocente) {
		this.listaDocente = listaDocente;
	}


	public List<Studente> getListaStudenti() {
		return listaStudenti;
	}


	public void setListaStudenti(List<Studente> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}

	public List<Corso> getListaCorso() {
		return listaCorso;
	}


	public void setListaCorso(List<Corso> listaCorso) {
		this.listaCorso = listaCorso;
	}


	

}

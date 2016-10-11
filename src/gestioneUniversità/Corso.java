package gestioneUniversità;

import java.util.ArrayList;
import java.util.List;

public class Corso implements ValidaDato{
	
	//attributi
	
	private String nome;
	private int ore;
	
	private String docentecorso;
	private List<Studente> studentiCorso= new ArrayList<Studente>();
	
	
	
	// costruttore
	
	

	public Corso(String nome, int ore) {
		this.nome = nome;
		this.ore = ore;
	}


	//getter setter
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getOre() {
		return ore;
	}



	public void setOre(int ore) {
		this.ore = ore;
	}
	
	public String getDocentecorso() {
		return docentecorso;
	}


	public void setDocentecorso(String docentecorso) {
		this.docentecorso = docentecorso;
	}


	public List<Studente> getStudentiCorso() {
		return studentiCorso;
	}


	public void setStudentiCorso(List<Studente> studentiCorso) {
		this.studentiCorso = studentiCorso;
	}


	@Override
	public boolean isValid() {
		boolean risultato=false;
		if((!nome.isEmpty() && nome!=null) && ore!=0){
		risultato=true;			
		}
		return risultato;
	}

	

}

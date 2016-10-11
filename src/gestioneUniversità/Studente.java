package gestioneUniversità;



import java.util.ArrayList;
import java.util.List;
//Utente è in gestione biblioteca in 22-09
import gestioneBiblioteca.Utente;

public class Studente extends Utente {
	
	//attributi e costruttore
	
	private String matricola;
	private String media;
	private Università uni;
	
	private List<Corso> corsiSeguiti = new ArrayList <Corso>();
	
	
	



	public Studente(String nome, String cognome) {
		super(nome, cognome);
	}
	
	
	
	
	public Studente(Università uni, String nome, String cognome, String matricola, String media) {
		super(nome, cognome);
		this.uni=uni;
		this.matricola=matricola;
		this.media=media;
		
	}
	
	//getter setter
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}
	
	public List<Corso> getCorsiSeguiti() {
		return corsiSeguiti;
	}




	public void setCorsiSeguiti(List<Corso> corsiSeguiti) {
		this.corsiSeguiti = corsiSeguiti;
	}






	
	
	
	
	

}

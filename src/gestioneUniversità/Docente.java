package gestioneUniversità;

import java.util.ArrayList;
import java.util.List;

import gestioneBiblioteca.Utente;


public class Docente extends Utente {

//attributi e costruttore con attributi super della classe padre + attr. classe figlio	
	
	private String codiceFiscale;
	
	
	private List<Corso> corsiTenuti = new ArrayList<Corso>();
	
	
	
	
	public Docente(String nome, String cognome, String codiceFiscale) {
		super(nome, cognome);
		this.codiceFiscale=codiceFiscale;
		
			}
//getter e setter
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public List<Corso> getCorsiTenuti() {
		return corsiTenuti;
	}

	public void setCorsiTenuti(List<Corso> corsiTenuti) {
		this.corsiTenuti = corsiTenuti;
	}

	
	

	
	

}

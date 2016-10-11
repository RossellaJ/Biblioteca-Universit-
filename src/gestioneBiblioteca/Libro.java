package gestioneBiblioteca;

import java.util.Map;

import gestioneUniversità.ValidaDato;

public class Libro implements ValidaDato{
	
	private String titolo;
	private String autore;
	private String serialNumber;
	private int copieTotali;
	private int copieDisponibili;
	
	
	
	//costruttore
	
	//V: inizializzo il num di copie con zero perchè all'inizio non mi interesseranno le copie

	public Libro(String titolo, String autore, String serialNumber,
			int copieTotali, int copieDisponibili) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.serialNumber = serialNumber;
		this.copieTotali = 0;
		this.copieDisponibili = 0;
	}
	




	// getter setter
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCopieTotali() {
		return copieTotali;
	}

	public void setCopieTotali(int copieTotali) {
		this.copieTotali = copieTotali;
	}

	public int getCopieDisponibili() {
		return copieDisponibili;
	}

	public void setCopieDisponibili(int copieDisponibili) {
		this.copieDisponibili = copieDisponibili;
	}

	//toString
	
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore
				+ ", serialNumber=" + serialNumber + ", copieTotali="
				+ copieTotali + ", copieDisponibili=" + copieDisponibili + "]";
	}

	@Override
	public boolean isValid() {

		boolean risultato=false;
		if((!titolo.isEmpty() && titolo!=null) && (!autore.isEmpty() && autore!=null)){
		risultato=true;			
		}
		return risultato;
	}





	
	

}

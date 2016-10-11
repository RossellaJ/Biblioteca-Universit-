package gestioneBiblioteca;

import java.util.Date;

public class Prestito {
	
	private Libro libro;
	private Utente utente;
	
	private Date dataPrestito;
	private Date dataRestituzione;
	
	
	//costruttore
	
	public Prestito() {
		
	}
	
	public Prestito(Libro libro, Utente utente, Date dataPrestito,
			Date dataRestituzione) {
	
		this.setLibro(libro); 
		this.utente = utente;
		this.dataPrestito = dataPrestito;
		this.dataRestituzione = dataRestituzione;
	}
	
	
	
	public Prestito(Utente utente,Libro libro,String stringDataprestito,Date dataRestituzione){
		
		this.utente=utente;
		
		this.libro=libro;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	//getter setter

	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Date getDataPrestito() {
		return dataPrestito;
	}

	public void setDataPrestito(Date dataPrestito) {
		this.dataPrestito = dataPrestito;
	}

	public Date getDataRestituzione() {
		return dataRestituzione;
	}

	public void setDataRestituzione(Date dataRestituzione) {
		this.dataRestituzione = dataRestituzione;
	}


	
	
	
	

}

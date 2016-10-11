package gestioneBiblioteca;

import java.util.List;

public class Gestione {

	// Metodo 1)

	public int registraLibro(Biblioteca b, String titolo, String autore,
			String serialNumber, int copieT, int copieD) {

		List<Libro> libri = b.getLibri();
		Libro ltemp = null;

		for (Libro l : b.getLibri()) {

			if (l.getTitolo().equals(titolo) && l.getAutore().equals(autore)
					&& l.getSerialNumber().equals(serialNumber)) {
				ltemp = l;
			}
		}

		int numerocopieaggiornato = 0;

		if (ltemp == null) {
			/*
			 * il libro non è stato trovato all'interno della lista, creo
			 * l'oggetto del libro e lo inserisco alla lista
			 */

			Libro libroNuovo = new Libro(titolo, autore, serialNumber, copieT,
					copieD);

			libri.add(libroNuovo);

			return copieT;

		} else {
			/*
			 * il libro esiste già nella lista di libri, creo variabili locali
			 * di tipo intero per prendere num di copie tot e disponibili
			 * all'interno dei dati dell'oggetto libro
			 */
			int copieTotalivecchie = ltemp.getCopieTotali();
			int copieDisponibilivecchie = ltemp.getCopieDisponibili();

			copieTotalivecchie += copieT;
			copieDisponibilivecchie += copieT;
			// += vuol dire che prendo quello stesso valore e aggiungo copieT

			ltemp.setCopieTotali(copieTotalivecchie);
			ltemp.setCopieDisponibili(copieDisponibilivecchie);

			numerocopieaggiornato = copieDisponibilivecchie;
			return numerocopieaggiornato;
		}
	}

	// Metodo 2)

	public boolean registraUtente(Biblioteca b, String nome, String cognome) throws UtenteGiaEsiste {

		

		List<Utente> utenti = b.getUtenti();
		Utente utemp = null;

		for (Utente u : utenti) {
			
			if (u.getNome().equals(nome) && u.getCognome().equals(cognome)) {
				
				throw new UtenteGiaEsiste("utente già esiste");
				
			
			}
		}
		if (utemp == null) {

			Utente utenteNuovo = new Utente(nome, cognome);
			utenti.add(utenteNuovo);

			
		}
		return true;
	}

	// Metodo 3)
	public boolean prestaLibro(Biblioteca b, String titolo, String autore,
			String nome, String cognome) {

		List<Utente> utenti = b.getUtenti();
		Utente utemp = null;
		for (Utente u : utenti) {
			if (u.getNome().equals(nome) && u.getCognome().equals(cognome)) {
				utemp = u;
			}
		}
		if(utemp==null){
			return false;
		}

		List<Libro> libri = b.getLibri();
		Libro ltemp = null;

		for (Libro l : libri) {
			if (l.getTitolo().equals(titolo) && l.getAutore().equals(autore)) {
				ltemp = l;
			}
		}
		if(ltemp==null){
			System.out.println("La biblioteca non possiede il libro"); 
			return false;
		
		}

		int copieDisp = ltemp.getCopieDisponibili();
		if (copieDisp >= 1) {

			
			if (utemp != null) {
				int copieRil = utemp.getCopieRilevate();
				if (copieRil <= 2) {

					copieDisp--;
					copieRil++;
					
					utemp.setCopieRilevate(copieRil);
					ltemp.setCopieDisponibili(copieDisp);
					
					utemp.getLibriRilevati().add(ltemp);
					b.getLibriPrestati().add(ltemp);
					
					System.out.println("Prestito avvenuto correttamente!");
					return true;
				} else {
					System.out.println("Copie massime raggiunte!Non è possibile effettuare il prestito!");
				}
			} 
		} else {
			System.out.println("Non ci sono attualmente copie disponibili!");
		}

		return false;
	}

//Metodo 4)
	
	public boolean restituzioneLibro(Biblioteca b, String titolo, String autore,String nome, String cognome) {

		List<Utente> utenti = b.getUtenti();
		Utente utemp = null;
		for (Utente u : utenti) {
			if (u.getNome().equals(nome) && u.getCognome().equals(cognome)) {
				utemp = u;
			}
		}
		if(utemp==null){
			
			System.out.println("L'utente non è registrato!");
			return false;
		}

		List<Libro> libri = b.getLibri();
		Libro ltemp = null;

		for (Libro l : libri) {
			if (l.getTitolo().equals(titolo) && l.getAutore().equals(autore)) {
				ltemp = l;
			}
		}
		if(ltemp==null){
			System.out.println("La biblioteca non possiede il libro"); 
			return false;
		
		}
		if( utemp.getLibriRilevati().contains(ltemp)){
			
			utemp.getLibriRilevati().remove(ltemp);
			b.getLibriPrestati().remove(ltemp);
			
			utemp.setCopieRilevate(utemp.getCopieRilevate() - 1);
			ltemp.setCopieDisponibili(ltemp.getCopieDisponibili() + 1) ;
			
			return true;
		}
			
			
		return false;
		
		}
			
		
			
	}
	
	
	
	
	
	
	


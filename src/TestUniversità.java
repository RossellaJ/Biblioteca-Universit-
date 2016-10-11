
import gestioneBiblioteca.Biblioteca;
import gestioneBiblioteca.Gestione;
import gestioneBiblioteca.Libro;
import gestioneUniversità.Corso;
import gestioneUniversità.Docente;
import gestioneUniversità.Segreteria;
import gestioneUniversità.Studente;
import gestioneUniversità.Università;

public class TestUniversità {

	public static void main(String[] args) {

		Università uni = new Università("Polito");

		Segreteria seg = new Segreteria();

		Studente s1 = new Studente("mmm", "jjj");
		Studente s2 = new Studente("kk", "jlo");
		Studente s3 = new Studente("nmrr", "llll");
		Studente s4 = new Studente("15lj", "htr");
		Studente s5 = new Studente("pppp", "ndddae");

		Docente d1 = new Docente("bbbbbbbb", "hhhhhhhhhhh", "jki22256lio");
		Docente d2 = new Docente("mf", "gu", "jik");
		
		
		//Studente s6 = seg.registraStudente(uni, "", "");
		//Studente s7 = seg.registraStudente(uni, "Mario", "Rossi");
		
		

		if (s1 == null) {
			System.out.println("Studente non valido. Registrazione annullata");
		} else {
			System.out.println(s1.getNome() + " " + s1.getCognome() + ", "
					+ "Studente valido. Registrazione effettuata");
		}

		if (s2 == null) {
			System.out.println("Studente non valido. Registrazione annullata");
		} else {
			System.out.println(s2.getNome() + " " + s2.getCognome() + ", "
					+ "Studente valido. Registrazione effettuata");
		}
		
 
		
		
 
		if (d1 == null) {
			System.out.println("Docente non valido. Registrazione annullata");
		} else {
			System.out.println(d1.getNome() + " " + d1.getCognome() + ", "
					+ d1.getCodiceFiscale() + " "
					+ "Docente valido. Registrazione effettuata");
		}
		if (d2 == null) {
			System.out.println("Docente non valido. Registrazione annullata");
		} else {
			System.out.println(d2.getNome() + " " + d2.getCognome() + " "
					+ d2.getCodiceFiscale() + ", "
					+ "Docente valido. Registrazione effettuata");
		}

 Corso c1 = seg.registraCorso(uni, "Statistica", 60);
 Corso c2 = seg.registraCorso(uni, "Sicurezza", 150);
 
 
 
		if (c1 == null) {
			System.out.println("Corso non valido. Registrazione annullata");
		} else {
			System.out.println(c1.getNome() + " " + c1.getOre() + " ore, "
					+ "Corso valido. Registrazione effettuata");
		}
		if (c2 == null) {
			System.out.println("Corso non valido. Registrazione annullata");
		} else {
			System.out.println(c2.getNome() + " " + c2.getOre() + " ore, "
					+ "Corso valido. Registrazione effettuata");
		}

		
		
		
		
		if (seg.aggiungiDocentealCorso(uni, d2, c1)) {
			System.out.println("Docente aggiunto al corso");
		} else {
			System.out.println("Docente NON aggiunto al corso");
		}
		if (seg.aggiungiDocentealCorso(uni, d2, c2)) {
			System.out.println("Docente aggiunto al corso");
		} else {
			System.out.println("Docente NON aggiunto al corso");
		}
		
		
		
		if (seg.aggiungiStudentialCorso(uni, s2, c1)) {
			System.out.println("Studente aggiunto al corso");
		} else {
			System.out.println("Studente NON aggiunto al corso");
		}
		if (seg.aggiungiStudentialCorso(uni, s1, c1)) {
			System.out.println("Studente aggiunto al corso");
		} else {
			System.out.println("Studente NON aggiunto al corso");
		}
 
		
		
		
		
		
		Biblioteca b = new Biblioteca ("");
		Gestione g = new Gestione();
		
	

		
		if (g.prestaLibro(b, "llllll", "jkiii","jierko","hiutere")) {
			System.out.println("Libro prestato");
		} else {
			System.out.println("Prestito non riuscito");
		}
	
		if (g.prestaLibro(b, "", "","","")) {
			System.out.println("Libro prestato");
		} else {
			System.out.println("Prestito non riuscito");
		}

	}
 


	

}

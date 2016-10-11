import gestioneBiblioteca.Biblioteca;
import gestioneBiblioteca.Gestione;
import gestioneBiblioteca.Libro;
import gestioneBiblioteca.Utente;


public class TestBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca ("Alfa");
	
		Gestione g = new Gestione();
		
		System.out.println("Registrazione Libri:");

		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 1,5));
		 System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 1,2));
		 System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 1,4));
		 System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 1,1));
		 System.out.println("Copie totali: "+g.registraLibro(b, "NNNN", "aaaa", "c", 1,8));
		 System.out.println("Copie totali: "+g.registraLibro(b, "FFFF", "aaaa", "f", 1,2));

		System.out.println("Registrazione Utenti:");
/* ho eccezione
		if(g.registraUtente(b, "Mario", "Rossi")==true){
		 System.out.println("Utente Registrato");
		 }else{
		 System.out.println("Utente già Registrato");}
		 if(g.registraUtente(b, "Mario", "Rossi")==true){
		 System.out.println("Utente Registrato");
		 }else{
		 System.out.println("Utente già Registrato");}
		 if(g.registraUtente(b, "Chiara", "Verdi")==true){
		 System.out.println("Utente Registrato");
		 }else{
		 System.out.println("Utente già Registrato");}
*/
		System.out.println("Prestito Libri: ");

		if(g.prestaLibro(b, "tttt", "aaaa", "Mario", "Rossi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}
		 if(g.prestaLibro(b, "TTTT", "AAAA", "Mario", "Rossi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}
		 if(g.prestaLibro(b, "NNNN", "aaaa", "Mario", "Rossi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}
		 if(g.prestaLibro(b, "FFFF", "aaaa", "Mario", "Rossi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}
		 if(g.prestaLibro(b, "NNNN", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}
		 if(g.prestaLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro prestato!");
		 }else{
		 System.out.println("Impossibile prestare!");}

		System.out.println("Resituzione libri: ");

		if(g.restituzioneLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro restituito!");
		 }else{
		 System.out.println("Impossibile restituire!");}
		 if(g.restituzioneLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro restituito!");
		 }else{
		 System.out.println("Impossibile restituire!");} 
		 }

		/*Utente u = new Utente("Marco","Fiore");
		Libro l = new Libro("hhh","kkk","ohtkiuyyy",5,3);

        if( g.prestaLibro(b,"titolo","AUTORE","NOM","COGN")==true){
        	System.out.println(g.prestaLibro(b, "titolo", "ore", "nome", "cognome"));
        }
         */
         
         
		
		
		
	
}



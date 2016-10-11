package gestioneBiblioteca;

import gestioneBiblioteca.Biblioteca;
import gestioneBiblioteca.Gestione;


public class TestBiblioteca {

	public static void main(String[] args) throws UtenteGiaEsiste {
		
		Biblioteca b = new Biblioteca ("Alfa");
	
		Gestione g = new Gestione();
		
		System.out.println("Registrazione Libri:");

		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 1, 1));
		 System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 1, 3));
		 System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 1, 2));
		 System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 1, 5));
		 System.out.println("Copie totali: "+g.registraLibro(b, "NNNN", "aaaa", "c", 1, 3));
		 System.out.println("Copie totali: "+g.registraLibro(b, "FFFF", "aaaa", "f", 1, 2));

		System.out.println("Registrazione Utenti:");  
		
		

		 System.out.println("Utente già Registrato");
		 if(g.registraUtente(b, "Mario", "Rossi")){
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

		/*if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro restituito!");
		 }else{
		 System.out.println("Impossibile restituire!");}
		 if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		 System.out.println("Libro restituito!");
		 }else{
		 System.out.println("Impossibile restituire!");} 
		*/ }
		 

		
	
	

	

}

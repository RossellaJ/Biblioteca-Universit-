package gestioneUniversità;

import java.util.List;

public class Segreteria {

	// Metodo 1) registraUtente

	public Studente registraStudente(Università uni, String nome,
			String cognome) {

		// verifico che lo studente non sia già iscritto

		List<Studente> studenti = uni.getListaStudenti();
		Studente s = null;

		for (Studente stemp : studenti) {

			if (stemp.getNome().equals(nome)
					&& stemp.getCognome().equals(cognome)) {

				s = stemp;
			}
			if (s == null) {

				Studente nuovoStudente = new Studente(nome, cognome);


				// devo generare la matricola

				String a = cognome.substring(0, 2);
				String b = nome.substring(0, 2);
				int c = studenti.size() + 1;

				String matricola1 = a + b + c;
				
				nuovoStudente.setMatricola(matricola1);

				studenti.add(nuovoStudente);
				
				System.out.println(nuovoStudente.getNome() + " " + nuovoStudente.getCognome() + ", "
					+ "Studente valido. Registrazione effettuata");
				
				return nuovoStudente;
				
			} else {
				
				System.out.println("Studente già registrato");
				
			}

		}
		return s;

	}

	
	// Metodo 2) registraDocente
	
	public Docente registraDocente(Università uni, String nome, String cognome, String codiceFiscale){
		
		List<Docente> docenti= uni.getListaDocente();
		
		Docente d = null;
		
		for (Docente dtemp : docenti){
			if(dtemp.getNome().equals(nome) && dtemp.getCognome().equals(cognome) && dtemp.getCodiceFiscale().equals(codiceFiscale)){
			d=dtemp;	
			}
		}
		if (d==null){
			
			Docente nuovoDocente= new Docente(nome,cognome,codiceFiscale);
			
			docenti.add(nuovoDocente);
			
			d= nuovoDocente;	
		}
		
		return d;
	}

	
	
	//Metodo 3)
	
	public Corso registraCorso(Università uni, String nomeCorso, int ore){
		
		List<Corso> corsi= uni.getListaCorso();
		
		Corso c = null;
		
		for (Corso ctemp : corsi){
			if(ctemp.getNome().equals(nomeCorso) && ctemp.getOre()==ore){
			c=ctemp;	
			}
		}
		if (c==null){
			
			Corso nuovoCorso= new Corso(nomeCorso,ore);
			
			corsi.add(nuovoCorso);
			
			c= nuovoCorso;	
		}
		
		return c;
		
	}
	
	// Metodo 4)
	
	public boolean aggiungiStudentialCorso(Università uni,Studente s, Corso c){
		
		boolean risultato=false;
		
		if((s.isValid() && c.isValid())){
			
			c.getStudentiCorso().add(s);
			s.getCorsiSeguiti().add(c);
			
			risultato= true;
			}

		return risultato;
		
	}
	
	
	// Metodo 5)
	
        public boolean aggiungiDocentealCorso(Università uni,Docente d, Corso c){
		
		boolean risultato=false;
		
		if((d.isValid() && c.isValid())){
			
			String docCors= c.getDocentecorso();
			
			String str=d.getNome()+" "+d.getCognome();
			
			docCors= str;
			
			d.getCorsiTenuti().add(c);
			
			risultato= true;
			}

		return risultato;
		
	}
	
	
}

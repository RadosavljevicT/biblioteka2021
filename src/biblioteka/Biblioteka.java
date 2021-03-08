package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	
	private LinkedList <Knjiga> knjige = new LinkedList<Knjiga>();


	 public void dodajKnjigu (Knjiga knjiga) {
		
		 if (knjiga == null || knjige.contains(knjiga))
			 throw new RuntimeException ("Knjiga ne sme biti null i ne sme biti duplikat"); 
		 
		 knjige.add(knjiga);
		
	}
	public void obrisiKnjigu (Knjiga knjiga) {
		
		if (knjiga == null || !knjige.contains(knjiga))
		throw new RuntimeException ("Knjiga ne sme biti null i mora postojati u biblioteci");
		knjige.remove(knjiga);
		
	}
	
	public LinkedList <Knjiga> vratiSveKnjige (){
		
		return knjige;
		
	}
	
	
		
		
	
}


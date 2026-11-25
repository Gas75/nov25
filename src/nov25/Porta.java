package nov25; // il primo rigo indica il package di appartenenza del file

public class Porta {
	// public: indica che il file è pubblico, cioè accessibile liberamente (si chiama modificatore/modifier)
	// class: dichiarazione di classe Java
	// Porta: nome della classe Java, unica nell'intero progetto
	
	// caratteristiche della porta
	String materiale; // String indica che materiale sarà un testo
	boolean aperta; // boolean indica che aperta potrà valere true (vero) o false (falso)
	
	// operazione della/sulla porta (le operazioni corrispondono alle fuction di JavaScript)
	public void cambiaStatoPorta() {
		// public come rigo 4
		// void: dichiaro che la funzione non emette un valore di ritorno (output)
		// cambiaStatoPorta(): nome della funzione scritta in notazione camelCase
		System.out.println("La porta è aperta? " + aperta); // equivalente del document.write() di JavaScript
		aperta = !aperta; // inverto lo stato della porta; il "!" nega/inverte quello che c'è accanto
		System.out.println("La porta di " + materiale + " è ora " + aperta);
	}
	
}
package nov25;

public class PortaTest {

	public static void main(String[] args) {
		// ogni programma Java si avvia da qui
		// static verrà spiegato in futuro...
		// main() nome che deve tassativamente avere il programma di avvio
		// String[] args è il vecchio sistema di acquisizione input dall'esterno, si scrive perché richiesto dalla sintassi
		
		// compiti del metodo main(): 1) creare oggetti/istanze, 2) inizializzare variabili, 3) eseguire metodi/funzioni
		// 1)
		Porta miaPorta = new Porta(); // dichiaro e creo un oggetto di tipo Porta
		// 2)
		miaPorta.materiale = "legno"; // assegno alla caratteristica materiale dell'istanza miaPorta il valore "legno"
		miaPorta.aperta = true; // inizio con la porta aperta
		// 3)
		miaPorta.cambiaStatoPorta();
	}
	
}
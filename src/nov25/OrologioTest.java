package nov25;

public class OrologioTest {

	public static void main(String[] args) {
		Orologio mioOrologio = new Orologio(); // dichiaro e creo un oggetto di tipo Orologio
		mioOrologio.ore = 17; // imposto l'ora legale (sbagliata)
		mioOrologio.minuti = 39; // imposto i minuti
		mioOrologio.stampaOra(); // stampo l'ora con i valori attuali
		mioOrologio.impostaOraSolare(); // passo all'ora solare
		mioOrologio.stampaOra(); // ristampo l'ora per verificare la modifica
		
		System.out.println(); // rigo vuoto
		
		Orologio tuoOrologio = new Orologio(); // dichiaro e creo un secondo oggetto di tipo Orologio
		tuoOrologio.stampaOra(); // stampo l'ora dell'istanza/dell'oggetto appena creata
		tuoOrologio.ore = 10; // ora di New York
		tuoOrologio.minuti = 46;
		tuoOrologio.stampaOra(); // stampo l'ora dopo aver impostato l'orario
		
		// le ore e i minuti di ciascun oggetto creato sono indipendenti tra loro, a meno di renderli uguali noi
	}

}

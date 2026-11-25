package nov25;

public class Orologio {
	// caratteristiche dell'orologio
	int ore; // int tipo numerico intero, ce ne sono altri ma Java "predilige" il tipo int
	int minuti;
	
	// dominio del problema: 1) stampare l'ora, 2) impostare l'ora solare, 3) impostare l'ora legale
	// 1)
	public void stampaOra() {
		System.out.println("Sono le " + ore + ":" + minuti);
	}
	
	// 2)
	public void impostaOraSolare() {
		ore--; // decremento la variabile ore
		System.out.println("Ora solare impostata");
	}
	
	// 3)
	public void impostaOraLegale() {
		ore++; // incremento la variabile ore
		System.out.println("Ora legale impostata");
	}
	
}

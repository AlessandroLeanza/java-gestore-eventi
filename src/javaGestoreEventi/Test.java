package javaGestoreEventi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il titolo dell'evento: ");
        String titoloEvento = scanner.nextLine();

        System.out.print("Inserisci la data dell'evento: ");
        String dataEvento = scanner.nextLine();

        System.out.print("Inserisci il numero dei posti totale: ");
        int postiTotaleEvento = scanner.nextInt();

        Eventi eventi = new Eventi(titoloEvento, dataEvento, postiTotaleEvento);
        
        System.out.println("Quante prenotazioni vuoi fare?");
       eventi.getNumeroPostiPrenotati();
	}
}

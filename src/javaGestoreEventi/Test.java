package javaGestoreEventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Eventi eventi = new Eventi(null, 0, 0);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci la data dell'evento nel formato dd-MM-yyyy: ");
		
	    String dataEventoString = scanner.nextLine();
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataEvento = LocalDate.parse(dataEventoString, formatter);

        LocalDate oggi = LocalDate.now();
        
        if (dataEvento.isBefore(oggi)) {
            System.out.println("La data dell'evento è già passata.");  
        } else {
        	System.out.println("Data corretta");
        }

	    System.out.print("Inserisci il numero di posti totali disponibili: ");
	    
	    int postiTotali = scanner.nextInt();
	    
	    if (postiTotali <= 0) {
	        System.out.println("Il numero di posti deve essere positivo."); 
	    }

	}

}

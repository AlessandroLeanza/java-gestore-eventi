package javaGestoreEventi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il titolo dell'evento: ");
        String titoloEvento = scanner.nextLine();

        System.out.print("Inserisci la data dell'evento nel formato dd-MM-yyyy: ");
        String dataEvento = scanner.nextLine();

        System.out.print("Inserisci il numero dei posti totale: ");
        int postiTotaleEvento = scanner.nextInt();

        Eventi eventi = new Eventi(titoloEvento, dataEvento, postiTotaleEvento);
        
        System.out.println("Vuoi effettuare delle prenotazioni? \n SI = 1 \n NO = 2 ");
        int prenotazioni = scanner.nextInt();
        
        if(prenotazioni == 1) {
        	System.out.println("Quanti posti vuoi prenotare?");
        	int postiPrenotati = scanner.nextInt();
        	eventi.prenota(postiPrenotati);
        	System.out.println("Hai prenotato " + eventi.getNumeroPostiPrenotati() + " posti");	
        } else if (prenotazioni == 2) {
        	System.out.println("Nessuna prenotazione da effettuare");
        }
        int postiDispinibili = (eventi.getNumeroPostiTotale() - eventi.getNumeroPostiPrenotati());
        System.out.println("Posti disponibili: " + postiDispinibili);
        
        System.out.println("Vuoi disdire qualche posto prenotato? \n SI = 1 \n NO = 2");
        int disdette = scanner.nextInt();
        
        if (disdette == 1) {
        	System.out.println("Quanti posti vuoi disdire?");
        	int postiDisdetti = scanner.nextInt();
        	eventi.disdici(postiDisdetti);
        	System.out.println("Hai disdetto " + postiDisdetti + " posti");
        	int postiDisponibili = postiDispinibili + postiDisdetti;
        	System.out.println("Posti disponibili: " + postiDisponibili);
        } else if (disdette == 2) {
        	System.out.println("Nessun posto da disdire");
        }
		LocalDateTime dataEOraConcerto = LocalDateTime.now();
		double prezzoConcerto = 70.00;
		Concerto concerto = new Concerto("Ultimo", "11-11-2022", 800, dataEOraConcerto, prezzoConcerto);
		System.out.println(concerto.getDataOraFormattata() + " " + concerto.getTitolo() + " " + concerto.getPrezzoFormattato());
    }
}

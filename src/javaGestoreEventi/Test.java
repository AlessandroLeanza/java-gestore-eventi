package javaGestoreEventi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument;
import javax.xml.crypto.Data;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci il titolo dell'evento: ");
        String titoloEvento = scanner.nextLine();

        System.out.print("\nInserisci la data dell'evento nel formato dd-MM-yyyy: ");
        String dataEvento = scanner.nextLine();
        
        String[] partiData = dataEvento.split("-");
        int giorno = Integer.parseInt(partiData[0]);
        int mese = Integer.parseInt(partiData[1]);
        int anno = Integer.parseInt(partiData[2]);
        if (giorno < 1 || giorno > 31) {
            System.out.println("Giorno inserito non valido.");
            return;
        }
        if (mese < 1 || mese > 12) {
            System.out.println("Mese inserito non valido.");
            return;
        }
        
        System.out.print("\nInserisci il numero dei posti totale: ");
        int postiTotaleEvento = scanner.nextInt();

        Eventi eventi = new Eventi(titoloEvento, dataEvento, postiTotaleEvento);
        
        System.out.println("\nVuoi effettuare delle prenotazioni? \n SI = 1 \n NO = 2 ");
        int prenotazioni = scanner.nextInt();
        
        if(prenotazioni == 1) {
        	System.out.println("\nQuanti posti vuoi prenotare?");
        	int postiPrenotati = scanner.nextInt();
        	eventi.prenota(postiPrenotati);
        	System.out.println("\nHai prenotato " + eventi.getNumeroPostiPrenotati() + " posti");	
        } else if (prenotazioni == 2) {
        	System.out.println("\nNessuna prenotazione da effettuare");
        }
        int postiDispinibili = (eventi.getNumeroPostiTotale() - eventi.getNumeroPostiPrenotati());
        System.out.println("\nPosti disponibili: " + postiDispinibili);
        
        System.out.println("\nVuoi disdire qualche posto prenotato? \n SI = 1 \n NO = 2");
        int disdette = scanner.nextInt();
        
        if (disdette == 1) {
        	System.out.println("\nQuanti posti vuoi disdire?");
        	int postiDisdetti = scanner.nextInt();
        	eventi.disdici(postiDisdetti);
        	System.out.println("\nHai disdetto " + postiDisdetti + " posti");
        	int postiDisponibili = postiDispinibili + postiDisdetti;
        	System.out.println("\nPosti disponibili: " + postiDisponibili);
        } else if (disdette == 2) {
        	System.out.println("\nNessun posto da disdire");
        }
        
		LocalDateTime dataEOraConcerto = LocalDateTime.now();
		double prezzoConcerto = 70.00;
		Concerto concerto = new Concerto(titoloEvento, dataEvento, postiTotaleEvento, dataEOraConcerto, prezzoConcerto);
		System.out.println(concerto);
		
    }
}

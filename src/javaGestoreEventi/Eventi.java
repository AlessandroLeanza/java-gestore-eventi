package javaGestoreEventi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Eventi {

	private String titolo;
	private String data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati = 0;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate dataEvento;
	LocalDate oggi = LocalDate.now();
	
	public Eventi (String titolo, String data, int numeroPostiTotale) {
		this.titolo = titolo;
		this.data = data;
		this.dataEvento =  LocalDate.parse(data, formatter);
		this.numeroPostiTotale = numeroPostiTotale; 
		
	        if (dataEvento.isBefore(oggi)) {
//	            System.out.println("La data dell'evento è già passata");  
	        } else if (dataEvento.isAfter(oggi)) {
//	        	System.out.println("Data prossima all'evento");	        	
	        } else {
	        	System.out.println("Data di oggi");
	        }
	        
	        if (numeroPostiTotale <= 0) {
		        System.out.println("Il numero di posti deve essere positivo."); 
		    } 
	}
	
	public void prenota (int numeroPrenotazioni) {
			
		if (dataEvento.isBefore(oggi) || numeroPostiPrenotati + numeroPrenotazioni > numeroPostiTotale) {
			System.out.println("Non puoi prenotare");
		} else {
			numeroPostiPrenotati += numeroPrenotazioni;
		}
	}
	
	public void disdici (int numeroDisdette) {
		
		if (dataEvento.isBefore(oggi) || numeroPostiPrenotati < numeroDisdette) {
			System.out.println("Non puoi disdire le prenotazioni");
		} else {
			numeroPostiPrenotati -= numeroDisdette;			
		}
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}

	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}

	@Override
	public String toString() {
		return "Eventi titolo = " + titolo + ", data = " + data + " ";
	}
	
	
}

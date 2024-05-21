package javaGestoreEventi;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Scanner;

public class Eventi {

	private String titolo;
	private int data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati = 0;
	
	public Eventi (String titolo, int data, int numeroPostiTotale) {
		this.titolo = titolo;
		this.data = data;
		this.numeroPostiTotale = numeroPostiTotale; 
	}
	
	public void prenota () {
		
	}
	
	public void disdici () {
		
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
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

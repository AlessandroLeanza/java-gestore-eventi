package javaGestoreEventi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Eventi {
	
		private LocalDateTime ora;
		private double prezzo;
		
	public Concerto(String titolo, String data, int numeroPostiTotale, LocalDateTime oraConcerto, double prezzoConcerto) {
		super(titolo, data, numeroPostiTotale);
		this.ora = oraConcerto;
		this.prezzo = prezzoConcerto;
		
	}
	public String getDataOraFormattata() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return ora.format(formatter);
    }

    public String getPrezzoFormattato() {
        return String.format("%.2f €", prezzo);
    }

	public LocalDateTime getOra() {
		return ora;
	}

	public void setOra(LocalDateTime ora) {
		this.ora = ora;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Concerto getDataOraFormattata()=" + getDataOraFormattata() + ", getPrezzoFormattato()="
				+ getPrezzoFormattato() + ", getTitolo()=" + getTitolo() + "";
	}
}

package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private int likes;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.likes = likes;
	}
	

	public String getBruker() {
		return bruker;

	}

	public void setBruker(String newbruker) {
		bruker = newbruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String newdato) {
		dato = newdato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String newtekst) {
		tekst = newtekst;
	}

	@Override
	public String toString() {
		return "TEKST" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n";

	}
	
	
}

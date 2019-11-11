package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private int likes;
	private String url;

	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.likes = likes;
		this.url = url;
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

	public String getUrl() {
		return url;

	}

	public void setUrl(String newurl) {
		url = newurl;
	}

	public String getTekst() {
		return tekst;

	}

	public void setTekst(String newtekst) {
		tekst = newtekst;
	}

	@Override
	public String toString() {
		return "BILDE" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";

	}

	
}

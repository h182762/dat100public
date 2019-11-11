package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;

public class Blogg {

	private Innlegg[] tabell;
	private int nesteLedige;

	public Blogg() {
		this.tabell = new Innlegg[20];
		this.nesteLedige = 0;

	}

	public Blogg(int lengde) {
		this.tabell = new Innlegg[lengde];
		this.nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return tabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int p = -1;
		int i = 0;
		while (i < nesteLedige && p == -1) {
			if (tabell[i] == innlegg) {
				p = i;
			}
			i++;
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		int p = finnInnlegg(innlegg);
		if (p >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		if (nesteLedige < tabell.length) {
			return true;
		} else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {

		int p = finnInnlegg(innlegg);

		if (p == -1) {
			if (nesteLedige == tabell.length) {
				utvid();
			}
			tabell[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < nesteLedige; i++) {
			str += tabell[i].toString();
		}
		return nesteLedige + "\n" + str;
	}
	// valgfrie oppgaver nedenfor

	public void utvid() {
		Innlegg[] ny = new Innlegg[2 * tabell.length];
		for (int i = 0; i < nesteLedige; i++) {
			ny[i] = tabell[i];
		}

		tabell = ny;
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		int p = finnInnlegg(innlegg);
		if (p >= 0) {
			nesteLedige--;
			tabell[p] = tabell[nesteLedige];
			tabell[nesteLedige] = null;
			return true;
		} else {
			return false;
		}
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}
package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.Blogg;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.Innlegg;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) throws Exception {

		String filNavn = filnavn;
		PrintWriter skriver = null;

		try {
			skriver = new PrintWriter(MAPPE + filNavn);

			skriver.println(samling.toString());

			return true;
		} catch (FileNotFoundException e) {
			return false;
		} finally {
			if (skriver != null) {
				skriver.close();
			}
		}

	}
}

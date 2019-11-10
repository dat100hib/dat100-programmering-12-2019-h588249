package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		try
		{
			PrintWriter writer = new PrintWriter(MAPPE + filnavn);

			writer.println(samling.getAntall());
			for (var innlegg : samling.getSamling())
			{
				if (innlegg != null)
				{
					writer.print(innlegg);
				}
			}

			writer.close();
		}
		catch (Exception e)
		{
			return false;
		}

		return true;
	}
}

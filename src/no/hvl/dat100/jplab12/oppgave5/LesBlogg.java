package no.hvl.dat100.jplab12.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;
import no.hvl.dat100.jplab12.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg
{
    private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

    private static String TEKST = "TEKST";
    private static String BILDE = "BILDE";

    public static Blogg les(String filnavn)
    {
        Blogg blogg = new Blogg();

        try
        {
            File file = new File(MAPPE + filnavn);
            Scanner reader = new Scanner(file);

            int num = reader.nextInt();

            while (num >= 0)
            {
                String line = reader.nextLine();
                if (line.equals(TEKST))
                {
                    int id = reader.nextInt();
                    reader.nextLine();
                    String bruker = reader.nextLine();
                    String dato = reader.nextLine();
                    int likes = reader.nextInt();
                    reader.nextLine();
                    String tekst = reader.nextLine();

                    blogg.leggTilUtvid(new Tekst(id, bruker, dato, likes, tekst));
                }
                if (line.equals(BILDE))
                {
                    int id = reader.nextInt();
                    reader.nextLine();
                    String bruker = reader.nextLine();
                    String dato = reader.nextLine();
                    int likes = reader.nextInt();
                    reader.nextLine();
                    String tekst = reader.nextLine();
                    String url = reader.nextLine();

                    blogg.leggTilUtvid(new Bilde(id, bruker, dato, likes, tekst, url));
                }
                num--;
            }
        } catch (Exception e)
        {
            System.out.println("Failed with error: " + e.getMessage());
        }

        return blogg;
    }
}

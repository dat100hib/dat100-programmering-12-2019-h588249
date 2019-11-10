package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg
{
    private String tekst;

    public Tekst()
    {
        super();
    }

    public Tekst(int id, String bruker, String dato, String tekst)
    {
        super(id, bruker, dato);
        this.tekst = tekst;
    }

    public Tekst(int id, String bruker, String dato, int likes, String tekst)
    {
        super(id, bruker, dato, likes);
        this.tekst = tekst;
    }

    public String getTekst()
    {
    	return tekst;
    }

    public void setTekst(String tekst)
    {
        this.tekst = tekst;
    }

    public String superToString()
	{
		return super.toString();
	}

    @Override
    public String toString()
    {
        return String.format("TEKST\n%s%s\n", superToString(), tekst);
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML()
    {
        return String.format("%s\n<p>%s</p>", super.toHTML(), tekst);
    }
}

package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst
{
	String url;

    public Bilde(int id, String bruker, String dato, String tekst, String url)
    {
        super(id, bruker, dato, tekst);
        this.url = url;
    }

    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url)
    {
        super(id, bruker, dato, likes, tekst);
        this.url = url;
    }

    public String getUrl()
    {
    	return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return String.format("BILDE\n%s%s\n%s\n", superToString(), getTekst(), getUrl());
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML()
    {
        return String.format("%s\n<iframe src=\"%s\" height=\"600\" width=\"800\">%s</iframe>", super.toHTML(), url, getTekst());
    }
}

package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg
{
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    public Innlegg()
    {
    	id = 0;
    	bruker = null;
    	dato = null;
    	likes = 0;
    }

    public Innlegg(int id, String bruker, String dato)
    {
    	this();
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
    }

    public Innlegg(int id, String bruker, String dato, int likes)
    {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
    }

	public int getId()
	{
		return id;
	}

	private void setId(int id)
    {
        this.id = id;
    }

	public String getBruker()
	{
		return bruker;
	}

	public void setBruker(String bruker)
	{
		this.bruker = bruker;
	}

	public String getDato()
	{
		return dato;
	}

	public void setDato(String dato)
	{
		this.dato = dato;
	}

	public int getLikes()
	{
		return likes;
	}

    public void doLike()
    {
        likes++;
    }

    public boolean erLik(Innlegg innlegg)
    {
        if (innlegg == null)
		{
			return false;
		}

        return this.id == innlegg.id;
    }

    @Override
    public String toString()
    {
        return String.format("%d\n%s\n%s\n%d\n", id, bruker, dato, likes);
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML()
    {
		return String.format("<h2>%s@%s [%d]</h2>", bruker, dato, id);
    }
}

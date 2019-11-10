package no.hvl.dat100.jplab12.oppgave3;

import jdk.jshell.spi.ExecutionControl;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg
{
    private Innlegg[] innleggtabell;
    private int nesteLedig = 0;

    public Blogg()
    {
        innleggtabell = new Innlegg[20];
    }

    public Blogg(int lengde)
    {
        innleggtabell = new Innlegg[lengde];
    }

    public int getAntall()
    {
        return nesteLedig;
    }

    public Innlegg[] getSamling()
    {
        return innleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg)
    {
		if (innlegg == null)
		{
			return -1;
		}

		for (int i = 0; i < nesteLedig; i++)
		{
			if (innleggtabell[i].erLik(innlegg))
			{
				return i;
			}
		}

		return -1;
    }

    public boolean finnes(Innlegg innlegg)
    {
        return finnInnlegg(innlegg) != -1;
    }

    public boolean ledigPlass()
    {
        return nesteLedig < innleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg)
    {
		if (!ledigPlass() || finnes(innlegg))
		{
			return false;
		}

		innleggtabell[nesteLedig++] = innlegg;
		return true;
    }

    public String toString()
    {
        String buff = String.format("%d\n", nesteLedig);

		for (int i = 0; i < nesteLedig; i++)
		{
			buff += innleggtabell[i].toString();
		}

		return buff;
    }

    // valgfrie oppgaver nedenfor

    public void utvid()
    {
        Innlegg[] tmpTabell = new Innlegg[innleggtabell.length * 2];

		for (int i = 0; i < nesteLedig; i++)
		{
			tmpTabell[i] = innleggtabell[i];
		}

		innleggtabell = tmpTabell;
    }

    public boolean leggTilUtvid(Innlegg innlegg)
    {
		if (finnes(innlegg))
		{
			return false;
		}
		if (!ledigPlass())
		{
			utvid();
		}

		innleggtabell[nesteLedig++] = innlegg;
		return true;
    }

    public boolean slett(Innlegg innlegg)
    {
		if (!finnes(innlegg))
		{
			return false;
		}

		innleggtabell[finnInnlegg(innlegg)] = innleggtabell[--nesteLedig];
		innleggtabell[nesteLedig] = null;

		return  true;
    }

    public int[] search(String keyword)
    {
		throw new UnsupportedOperationException(TODO.method());
    }
}
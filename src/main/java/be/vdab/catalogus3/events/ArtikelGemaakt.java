package be.vdab.catalogus3.events;

import be.vdab.catalogus3.domain.Artikel;

public class ArtikelGemaakt {
    private final long id;
    private final String naam;
    public ArtikelGemaakt(Artikel artikel) {
        id = artikel.getId();
        naam = artikel.getNaam();
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}

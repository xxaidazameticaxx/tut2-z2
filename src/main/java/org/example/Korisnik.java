package org.example;

import java.util.Objects;

public class Korisnik extends Osoba {

    private Racun racun;

    public Racun getRacun() {
        return racun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Korisnik korisnik)) return false;
        return Objects.equals(racun, korisnik.racun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racun);
    }

    public void setRacun(Racun racun) {

        this.racun = racun;
    }

    public Korisnik(String ime, String prezime) {

        super(ime, prezime);
    }
    public void dodajRacun(Racun r) {

        this.racun = racun;
    }
}

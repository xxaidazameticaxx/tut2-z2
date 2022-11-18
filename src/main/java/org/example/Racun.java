package org.example;

public class Racun {

    private Long brojRacuna;
    private Osoba korisnikRacuna;

    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoračenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double iznos)
    {
        return this.prekoračenje > iznos;
    }
    public boolean IzvrsiUplatu(Double iznos)
    {
        this.stanjeRacuna += iznos;
        return true;
    }
    public boolean IzvrsiIsplatu(Double iznos)
    {
        if(this.stanjeRacuna + this.prekoračenje < iznos) return false;
        else{
            this.stanjeRacuna -=iznos;
            return true;
        }
    }
    public void odobriPrekoracenje(Double iznos)
    {
        this.prekoračenje = iznos;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public Double getPrekoračenje() {
        return prekoračenje;
    }

    public void setPrekoračenje(Double prekoračenje) {
        this.prekoračenje = prekoračenje;
    }
}

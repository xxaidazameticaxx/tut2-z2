package org.example;

public class Osoba {
    private String prezime;
    private String ime;
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "prezime='" + prezime + '\'' +
                ", ime='" + ime + '\'' +
                '}';
    }
}



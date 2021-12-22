package com.sample;

public class Pytanie{
    public String pytanie;
    public String odpowiedz;

    public Pytanie() {
    }

    public Pytanie(String pytanie, String odpowiedz) {
        this.pytanie = pytanie;
        this.odpowiedz = odpowiedz;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }
}
package com.alineselle;

public class Main {

    public static void main(String[] arg){

        LecteurMP3 lecteur = new LecteurMP3();
        lecteur.setVolume(LecteurMP3.Volume.LOW);
        lecteur.setVolume(LecteurMP3.Volume.HIGH);

      Horoscope h = new Horoscope();
       h.setDay(Horoscope.Day.MONDAY);
       h.getInfo();
       h.setDay(Horoscope.Day.FRIDAY);
       h.getInfo();
       h.setDay(Horoscope.Day.SATURDAY);
       h.getInfo();

}
    }



package com.alineselle;

public class LecteurMP3 {

    public enum Volume {
        LOW(10),
        MEDIUM(50),
        HIGH(100);

        private int value;
        private String name;

        //creation d'un constructor dans Enum
        //le constructeur au niveau d'enumeration est toujours privé
        Volume(int value) {
            this.value = value;

        }

        public String toString() {
            return String.valueOf(value);//valueOf means prend int value
            //et le transforme en String
        }

        public static void alert() {
            System.out.println("Attention à vos oreilles!");
        }

    }


    private Volume volume;

    public void setVolume(Volume volume) {

        if (volume.equals(Volume.HIGH)) {
            Volume.alert();

        }
        this.volume = volume;
    }

    public Volume getVolume() {
        return volume;
    }


    /*private String volume;

    //pour changer le volume
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume(){
        return volume;
    }*/

}

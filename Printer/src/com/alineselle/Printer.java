package com.alineselle;

public class Printer {

    private int MaxTonerLevel = 100;
    private int nbPagesPrinted;
    private boolean duplex;


    public void tonerLevel(int tonerUsed) {
        if (this.MaxTonerLevel <= 0) {
            System.out.println("Your printer is out of toner. You must fill it up.");
        } else if (tonerUsed > 0 && tonerUsed < 100) {

            this.MaxTonerLevel -= tonerUsed;
            System.out.println("Toner level equals to " + this.MaxTonerLevel + " %.");

            }
    }

    public void setNbPagesPrinted(int nbPagesPrinted) {
        this.nbPagesPrinted += nbPagesPrinted;
    }

    public int getNbPagesPrinted() {
        return this.nbPagesPrinted;
    }

    public int remainingToner() {
        return this.MaxTonerLevel;
    }


    public void isDuplex(boolean duplex, int nbPagesPrinted) {
        int papers;
        this.duplex = duplex;
        if (duplex == true) {

            if (nbPagesPrinted % 2 == 0) {
                papers = nbPagesPrinted / 2;
                System.out.println("Papers printed equals to " + papers);
            } else if (nbPagesPrinted % 2 > 0) {
                papers = nbPagesPrinted / 2 + 1;
                System.out.println("Papers printed equals to " + papers);
            }
        } else {
            papers = nbPagesPrinted;
            System.out.println("Papers printed equals to " + papers);
        }
    }
}








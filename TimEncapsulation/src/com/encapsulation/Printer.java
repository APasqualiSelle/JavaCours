package com.encapsulation;

public class Printer {
    public class PrinterTim {


        private int tonerLevel;
        private int pagesPrinted;//Tom didn't use this variable into the constructor because he will do a method with it
        private boolean duplex;

        public PrinterTim(int tonerLevel, boolean duplex) {

            if(tonerLevel>-1 && tonerLevel <=100){
                this.tonerLevel = tonerLevel;
            } else {
                this.tonerLevel = -1;
            }

            this.duplex = duplex;
            this.pagesPrinted = 0;
        }

        public int addToner(int tonerAmount){

            if(tonerAmount >0 && tonerAmount <=100){
                if(this.tonerLevel + tonerAmount>100){
                    return -1;
                }
                this.tonerLevel += tonerAmount;//I was expecting here an 'else if'
                return this.tonerLevel;
            } else {
                return -1;
            }
        }

        public int printPages(int pages){
            int pagesToPrint = pages;
            if(this.duplex){
                pagesToPrint=(pages/2)+(pages%2);
                System.out.println("Printing in the duplex mode");
            }
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

        public int getPagesPrinted() {//here I dont understand why to set a getter
            return pagesPrinted;
        }
    }



}

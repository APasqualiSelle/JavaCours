package com.alineselle;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a class and demonstrate proper encapsulation techniques
        //the class will be called Printer
        //It will simulate a real Computer Printer
        //It should have fields for the toner Level, number of pages printed, and
        //also whether its a duplex printer (capable of printing on both sides of the paper).
        //Decide on the scope, whether to use constructors, and anything else you think is needed

        Printer printer = new Printer();

       printer.tonerLevel(30);
       printer.tonerLevel(45);
       printer.tonerLevel(50);
     /* printer.isDuplex(true,119);
      printer.isDuplex(false,45);
        printer.setNbPagesPrinted(40);
        System.out.println(printer.getNbPagesPrinted());
        printer.setNbPagesPrinted(39);
        System.out.println(printer.getNbPagesPrinted());
   printer.tonerLevel(89);
*/
        }
}

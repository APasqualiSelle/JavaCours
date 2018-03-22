package com.alineselle;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total Burger price is "+hamburger.itemizeHamburger());*/
      /*  HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.addHamburgerAddition1("egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " +healthyBurger.itemizeHamburger());*/

        DeluxeHamburger db=new DeluxeHamburger();
       db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();


    }
}

package com.alineselle;

public class BasicBurger {

    private String name;
    private double basePrice;
    private boolean meat;
    private String rollType;
    private boolean carrot;
    private boolean tomato;
    private boolean cheese;
    private boolean lettuce;
    private double total;
    private double carrotPrice = 0.30;
    private double cheesePrice = 0.20;
    private double tomatoPrice = 0.25;
    private double lettucePrice = 0.15;


    public BasicBurger(double price, boolean meat, String rollType) {

        this.basePrice = 2.50;
        this.meat = meat;
        this.rollType = rollType;

    }
protected void getBaseBurger() {


        if (this.meat == true) {
            System.out.println("Base ingredients: " + getRollType() + " bread and meat");
            System.out.println(getName() + " burger = " + this.basePrice);


        } else if (meat == false) {
            System.out.println("Base ingredients: " + getRollType() + " bread and no meat");
            System.out.println(getName() + " burger = " + this.basePrice);

        }
        System.out.println("*********************");
    }

    public void choosenAdditions(boolean carrot, boolean cheese, boolean tomato, boolean lettuce) {

        if(carrot == true){
            System.out.println("Carrot = "+carrotPrice);
        }
        if(cheese == true){
            System.out.println("Cheese = "+cheesePrice);
        }
      if(tomato == true){
          System.out.println("Tomato = "+tomatoPrice);
      }
        if(lettuce == true){
            System.out.println("Lettuce = "+lettucePrice);
        }

        this.carrot = carrot;
        this.cheese=cheese;
        this.tomato=tomato;
        this.lettuce=lettuce;


    }

    protected double sumAdditions() {


        if (this.carrot == true) {

            this.total += this.carrotPrice;

        }
        if (this.cheese == true) {
            this.total += this.cheesePrice;

        }
        if (this.tomato == true) {
            this.total += this.tomatoPrice;

        }
        if (this.lettuce == true) {
            this.total += this.lettucePrice;


        }


        return this.total;

    }


    public double totalAmount() {

        getBaseBurger();
        return getBasePrice() + this.sumAdditions();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Base ";
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
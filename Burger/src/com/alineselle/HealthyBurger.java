package com.alineselle;

public class HealthyBurger extends BasicBurger {

    private String rolltype;
    private boolean onions;
    private boolean eggs;
    double onionsPrice = 0.13;
    double eggsPrice = 0.45;
    double total = 0;


    public HealthyBurger(double price, boolean meat, String rollType) {
        super(price, meat, rollType);
        this.rolltype = rollType;

    }


    @Override
    public void choosenAdditions(boolean carrot, boolean cheese, boolean tomato, boolean lettuce) {
        super.choosenAdditions(carrot, cheese, tomato, lettuce);
    }

    public void choosenHealthyAdditions(boolean onions, boolean eggs) {

        this.onions = onions;
        this.eggs = eggs;

        if (onions == true) {
            System.out.println("Onions = " + onionsPrice);
        }
        if (eggs == true) {
            System.out.println("Eggs = " + eggsPrice);
        }




    }

    private double sumHealthyAdditions() {


        if (this.onions == true) {
            this.total += onionsPrice;

        }
        if (this.eggs == true) {

            this.total += eggsPrice;

        }



        return this.total;


    }


    @Override
    public double totalAmount() {
        getBaseBurger();
        return super.sumAdditions()+sumHealthyAdditions()+getBasePrice();
    }

    @Override
    public String getName() {
        return "Healthy";
    }

    @Override
    public String getRollType() {
        return "red rye roll type";
    }
}

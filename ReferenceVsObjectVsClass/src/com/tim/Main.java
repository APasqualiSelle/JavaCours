package com.tim;

public class Main {

    public static void main(String[] args) {
	// write your code here

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;//that creates a reference to the same objet in memory

        /*System.out.println(blueHouse.getColor());//prints blue
        System.out.println(anotherHouse.getColor());//prints blue*/

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());//prints yellow, because here the two references point to the same object
        //once I change the color of one, both will change

       /* anotherHouse.setColor("red");//prints red
        System.out.println(blueHouse.getColor());//prints red
        System.out.println(anotherHouse.getColor());//prints red

        House greenHouse = new House ("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());//prints red
        System.out.println(greenHouse.getColor());//prints green
        System.out.println(anotherHouse.getColor());//prints green

        //what we pass in a parameter is called Reference*/

    }
}

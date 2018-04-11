package com.alineselle;
import java.util.ArrayList;

public class MyClass {

    public static void main(String[]args){
        int simpleArray[] = new int[5];//or {1,2,3,4,5};
        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(1);
        myList.add(5);
        myList.add(555);
       myList.add(74);
        myList.add(85);

        for(Integer x:myList)
            System.out.println(x);

        System.out.println("size = " +myList.size());
        myList.remove(2);
        myList.clear();

        for(Integer x:myList)
            System.out.println(x);
        System.out.println("size = " +myList.size());

    }
}

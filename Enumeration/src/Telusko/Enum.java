package Telusko;

//enum can implement interface
//enum cannot extends a class
//we can create methods, intialize variables inside an Enum
//we cannot create an Enum inside a method, but we can create an enum inside of a class



interface Demo
{

}

enum Mobile implements Demo {
    APPLE(100), SAMSUNG, HTC(90);

    int price;

    Mobile()
    {
        price=80;
        System.out.println("Constructor");
    }
    Mobile(int p){
        price = p;
    }


    public int getPrice()
    {
        return price;
    }
}

public class Enum {

    public static void main(String[]args){

      //  System.out.println(MobileCompany.APPLE);
        Mobile m = Mobile.APPLE;
        switch(m){
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("1st Copy of Apple");
                break;
        }

        System.out.println(Mobile.APPLE.getPrice());
        System.out.println(Mobile.APPLE.ordinal());
        System.out.println(Mobile.SAMSUNG.ordinal());

        //now, for printing all the constants inside the enum, we can create an array
        Mobile testMobile[]=Mobile.values();
        for(Mobile mobile : testMobile)
        {
            System.out.println(mobile);
        }

    }


}

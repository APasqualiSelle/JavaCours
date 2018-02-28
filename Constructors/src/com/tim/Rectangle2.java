package com.tim;

public class Rectangle2 {

    private int x;
    private int y;
    private int width;
    private int height;


    //1st constructor
    public Rectangle2(){
        this(0,0);//calls the 2nd constructor
    }


    //2nd constructor
    public Rectangle2(int width,int height){
        this(0,0,width, height);//calls the 3rd constructor
    }
//3rd constructor
    public Rectangle2(int x, int y, int width, int height) {
    //Inititialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

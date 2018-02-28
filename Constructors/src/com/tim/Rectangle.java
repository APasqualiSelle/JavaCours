package com.tim;

public class Rectangle extends Shape{


    private int width;
    private int height;

//1st constructor
    public Rectangle(int x, int y){
        this(x,y,0,0);//calls the second constructor
    }

    //2nd constructor
    public Rectangle(int x, int y, int width, int height){
        super(x, y);//calls the constructor from parent Shape
        this.width=width;
        this.height=height;
    }


}

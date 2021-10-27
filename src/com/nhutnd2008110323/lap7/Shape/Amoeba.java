package com.nhutnd2008110323.lap7.Shape;

public class Amoeba extends Shape{
    int x,y;

    Amoeba(){};
    
    protected Amoeba(String s){};
    protected Amoeba(int xx,int yy){
        x = xx;
        y = yy;
    };

    protected void rotare(){
        System.out.println("xoay theo toa do x =  "+ x +" va y = " + y );
    };

    protected void play(){
        System.out.println("Amoeba sound");
    }
}
package com.nhutnd2008110323.lap7.Shape;

public class Circle extends Shape {
    Circle(String s ){
        Sound = s;
    }
   protected void playSound(){
       System.out.println("insert am thanh.AIF: "+ Sound);
   }
}
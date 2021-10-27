package com.nhutnd2008110323.lap7.Shape;

public class Square extends Shape{
    Square(String s){
        Sound = s;
    }
   protected void playSound(){
       System.out.println("insert am thanh.AIF: "+ Sound);
   }
}

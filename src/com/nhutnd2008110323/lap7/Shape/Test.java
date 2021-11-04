package com.nhutnd2008110323.lap7.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle ();
        circle.rotare ();
        circle.play ();

        System.out.println("------------");

        Square square = new Square ();
        square.rotare ();
        square.play ();

        System.out.println("------------");
        
        Triangle triangle = new Triangle ();
        triangle.rotare ();
        triangle.play ();

        System.out.println("------------");
        Amoeba amoeba = new Amoeba ();
        amoeba.rotare ();
        amoeba.play ();
    }
}
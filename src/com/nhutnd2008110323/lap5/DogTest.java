package com.nhutnd2008110323.lap5;

public class DogTest {
    public static void main(String[] args) {
        Dog dog;
       dog = new Dog();
        System.out.println("tuổi : "+dog.age);
        dog = new Dog(5.9);
        System.out.println("cân Nặng : "+dog.weight);
        dog= new Dog(15, 3);
        System.out.println("Tuổi : "+dog.age);
        System.out.println("Cân Nặng : "+dog.weight);
        
    }
    
}

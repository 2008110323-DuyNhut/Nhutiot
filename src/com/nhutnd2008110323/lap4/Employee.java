package com.nhutnd2008110323.lap4;

import java.util.Scanner;
class Employee {
    String Name;
    String Slary;
    String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên NV");
        Name = sc.nextLine();
        return null;
    }
    String getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Lương Nv");
        Slary = sc.nextLine();
        return null;
    }
    void showEmloyee(){
        
    }
    
}
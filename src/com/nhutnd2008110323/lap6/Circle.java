package com.nhutnd2008110323.lap6;

public class Circle {
    String amThanh =  "ret ret";
    boolean Click = false;
     void xoay()
     {
         System.out.println("da xoay 360 do");
         Click = true;
     }
    void phatRaAmThanh()
     {
        if (Click = true)
        {
            System.out.println("insert am thanh hinh tron: "+amThanh);
        }
        else
        {
            System.out.println("chua bam nut kia!!!");
        }
     }
}
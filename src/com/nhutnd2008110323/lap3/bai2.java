package com.nhutnd2008110323.lap3;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1;i <= 10;i++)
        {
            System.out.println("Đây là chương trình in bảng nhân!");
            System.out.printf("Bảng Nhân " +i);
            for(j = 1;j < 10;j++)
            {
                System.out.printf("\n%d x %d = %d\n",i,j,i*j);
            }
    }
}
}
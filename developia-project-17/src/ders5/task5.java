package ders5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);

        }
        System.out.println("------------------------------");
        int sum = 0;
        for(int j=0;j<=100;j++){
            sum += j;



        }
        System.out.println(sum);

        for(int b=1;b<=100;b++){
         if(b%7==0){
             System.out.println(b);
         }



            }

        System.out.println("--------------------------");

        int c = 6;
        if(c%2==0){
            System.out.println("eded cutdur");
        }else{
            System.out.println("eded tekdir");

        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("eded cutdur");

        } else{
            System.out.println("eded tekdir");
        }
        System.out.println("----------------------------");

        for(int k =0;k<200;k++){
            if(k%3==0 && k%7==0){
                System.out.println(k);
            }
        }
        System.out.println("----------------------------");
        for(int s=0;s<400;s++){
            if(s%5==0 && s%9==0){
                System.out.println(s);
            }
        }
        System.out.println("=================");


         for(int t=1;t<20;t++){
             if(t%1==0) {


                 System.out.println(t);
             }
             }
        System.out.println("----------------------------");

         for(int f = 50;f>=20;f--){
             System.out.println(f);
         }
        System.out.println("----------------------------");
         for(double tm= 0;tm<=5;tm+=0.1){
             System.out.println(tm);
         }


         }

        }



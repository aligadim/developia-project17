package ders6;

import java.util.Scanner;

public class mesele3 {
    public static void main(String[] args) {
        //100 manat
        //20 aalma
        //30 armud
        //ne qederdi

       int pulumuz = 100;
       int almapul = 20;
       int armud = 30;
       pulumuz-=almapul;
       pulumuz-=armud;
        System.out.println(pulumuz);

        Scanner sc= new Scanner(System.in);
        System.out.println("Senin nece manat pulun var");

        int m= sc.nextInt();

        if(m>50){
            System.out.println("kifayet eder");

        }
        else if(m>40){
            System.out.println("Bir qeder borclu qalacaqsan");

        }
        else{
            System.out.println("biz size hecne vere bilmerik");
        }




    }
}

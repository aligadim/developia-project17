package ders5;

public class Operatorlar2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;


        boolean netice = a!=b;

        System.out.println(netice);
        System.out.println("-------menimsetme----");

        int d = 9;
        d = d+3;
        d+=3;

        int age = 19;
        boolean daydayVar = true;
        String messages = age>= 18 && daydayVar?"telefon olar":"telefon olmaz";
        System.out.println(messages);

    }
}

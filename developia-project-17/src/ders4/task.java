package ders4;

public class task {
    public static void main(String[] args) {
        int age = 400;
        short myAge= (short) age;
        System.out.println("1-ci "+myAge);

        short sh = 69;
        byte bt = (byte) sh;
        System.out.println("2-ci "+bt);

        short st = 589;
        byte byt =(byte) st;
        System.out.println("3-ci "+byt);

        long lg = 458;
        int i = (int) lg;
        System.out.println("4-ci "+i);

        long l= 52523635483L;
        int in = (int) l;
        System.out.println("5-ci "+in);

        double d = 5632.6;
        float f = (float) d;
        System.out.println("6-ci "+f);

        char c = 'D';
        int ch =  c;
        System.out.println("7-ci "+ch);

        int dn = 453;
        char cr = (char)dn;
        System.out.println("8-ci "+cr);


        int ss = 81;
        ss>>=3;
        System.out.println(ss);

        int a = 10;
        int b = 15;
        int e = 30;
        int x = 40;

        System.out.println("a + b "+ (a+b));
        System.out.println("a - b "+ (a-b));
        System.out.println("a * b "+ (a*b));
        System.out.println("e / a "+ (e/a));
        System.out.println("a - b "+ (a-b));
        System.out.println("b % a "+ (b%a));
        System.out.println("x % b "+ (x%b));
        System.out.println("++a "+ (++a));
        System.out.println("b++ "+ (b++));
        System.out.println("x-- "+ (x--));


    }


}

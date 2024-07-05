package ders_08;

public class MainMeethods {
    public static void main(String[] args) {
        Kompyuter2 iPhone = new Kompyuter2();
        iPhone.id = 5;
        iPhone.model = "A15";
        iPhone.brand = "Apple";
        iPhone.color ="white";

        Kompyuter2 eurolux = new Kompyuter2( 4);
        eurolux.model = "A11";
        eurolux.brand = "EurOlux";
        eurolux.color = "gren";


        Kompyuter2 toshiba = new Kompyuter2("T70","Toshiba netbook","black");
        toshiba.id = 4;

        System.out.println(iPhone.id);
        System.out.println(iPhone.brand);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println("===============");

        System.out.println(eurolux.id);
        System.out.println(eurolux.brand);
        System.out.println(eurolux.model);
        System.out.println(eurolux.color);
        System.out.println("================");

        System.out.println(toshiba.id);
        System.out.println(toshiba.brand);
        System.out.println(toshiba.model);
        System.out.println(toshiba.color);

    }
}

package ders_07;

import java.util.SortedMap;

public class MainCar {
    public static void main(String[] args) {
        Car Lada = new Car();
        Car Kia =new Car();
        Car Tayota = new Car();
        Car Opel = new Car();

        Lada.reng = "qara";
        Lada.model = "Largus";
        Lada.yurus = 2_000;
        Lada.date = 2006;
        Lada.start(20);


        Kia.reng = "goy";
        Kia.model = "Serando";
        Kia.yurus = 1_000;
        Kia.date = 2010;
        Kia.start(10);


        Tayota.reng = "Mokro asvalt";
        Tayota.model = "Carolla";
        Tayota.yurus = 3_000;
        Tayota.date = 2015;
        Tayota.start(10);


        Opel.reng = "Qirmizi";
        Opel.model = "Astara";
        Opel.yurus= 3_200;
        Opel.date = 2007;
        Opel.start(5);

        System.out.println("Lada: "+Lada.model);
        System.out.println("Reng: "+Lada.reng);
        System.out.println("Yurus: "+Lada.yurus);
        System.out.println("Istehsal Tarixi: "+Lada.date);
        System.out.println("Yasi: "+Lada.thisdate);
        System.out.println("===============");

        System.out.println("Kia: "+ Kia.model);
        System.out.println("Reng: "+Kia.reng);
        System.out.println("Yurus: "+Kia.yurus);
        System.out.println("Istehsal Tarixi: "+Kia.date);
        System.out.println("Yasi: "+Kia.thisdate);
        System.out.println("===============");

        System.out.println("Tayota: "+Tayota.model);
        System.out.println("Reng: "+Tayota.reng);
        System.out.println("Yurus: "+Tayota.yurus);
        System.out.println("Istehsal Tarixi:"+Tayota.date);
        System.out.println("Yasi: "+Tayota.thisdate);
        System.out.println("===============");

        System.out.println("Opel: "+Opel.model);
        System.out.println("Reng: "+Opel.reng);
        System.out.println("Yurus: "+Opel.yurus);
        System.out.println("Istehsal Tarixi: "+Opel.date);
        System.out.println("Yasi: "+Opel.thisdate);
        System.out.println("===============");



    }
}

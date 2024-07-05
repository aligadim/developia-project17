package ders_08;

public class Phon {
    //deyisenler
    int price;
    String brand;

    //metodlar
    void charge(){
        System.out.println(brand+" charcig");
    }

    void bomp(){
        System.out.println(brand+" bombed");
    }

    Phon(){
        System.out.println("Parametiri olmayan");
    }

    Phon(String brand){
        this.brand=brand;

    }
    Phon(String brand, int price){
        this.brand=brand;
        this.price = price;

    }
}



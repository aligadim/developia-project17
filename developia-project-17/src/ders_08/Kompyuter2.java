package ders_08;

public class Kompyuter2 {
    int id;
    String model;
    String brand;
    String color;

    Kompyuter2(){
        System.out.println("Parametrsiz");
    }
    Kompyuter2(int id){
        this.id = id;
    }
    Kompyuter2(String brand,String model,String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}

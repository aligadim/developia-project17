package ders_08;

import java.sql.SQLOutput;

public class Kompyuter {
    int id;
    String model;
    String brand;
    String color;

    Kompyuter(){
        System.out.println("Parametrsiz");

    }
    Kompyuter(String model){

        this.model = model;

    }
    Kompyuter(String model, String color){
       this.model=model;
       this.color = color;

    }




}

package ders_07;

public class Car {
    String reng;
    String model;
    int yurus;
    int date;
    int thisdate;

    void start(int probeg){
        thisdate = thisdate-date;

        yurus++;


    }


    public Car(String reng, String model, int yurus, int date, int thisdate) {
        this.reng = reng;
        this.model = model;
        this.yurus = yurus;
        this.date = date;
        this.thisdate = thisdate;
    }


    public Car() {
    }

    public Car(int yurus, int date, String reng) {
        this.yurus = yurus;
        this.date = date;
        this.reng = reng;
    }
}

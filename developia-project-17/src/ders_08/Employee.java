package ders_08;

public class Employee {
    int id;
    String name;
    String surname;
    String phon;
    String adres;
    int age;
    int slayr;


    Employee(){

    }
    void olum(int isMuddeti){
        age+=isMuddeti;
        slayr = age;
        System.out.println(slayr+" Yasinda vefat edib");
    }
    Employee(String name){
        this.name = name;

    }

    Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    Employee(String name, String surname, int slayr){
        this.name = name;
        this.surname = surname;
        this.slayr=slayr;

    }
}

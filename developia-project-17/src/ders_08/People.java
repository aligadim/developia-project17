package ders_08;

public class People {
    int id;
    String name;
    String surname;
    int age;
    String phon;


    void year(int old){
        age+=old;
        System.out.println(age);
    }

     People(int id,String name,String surname,int age,String phon ){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.age = age;
        this.phon=phon;




    }

}

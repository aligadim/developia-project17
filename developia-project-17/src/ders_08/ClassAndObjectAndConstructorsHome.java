package ders_08;

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {
        Employee person1 = new Employee("Hafiz","Memmedov");
        person1.id=1;
        person1.adres = "Xacmaz";
        person1.age = 45;
        person1.phon = "055 677 17 34";
        System.out.println(person1.id);
        System.out.println(person1.name);
        System.out.println(person1.surname);
        System.out.println(person1.adres);
        System.out.println(person1.phon);
        person1.olum(34);
        System.out.println("======+++======");


        Employee person2 = new Employee("Mehemmed","Hesenov",10);
        person2.id=2;
        person2.adres="Quba";
        person2.age=48;
        person2.phon = "055 677 45 67";
        System.out.println(person2.id);
        System.out.println(person2.name);
        System.out.println(person2.surname);
        System.out.println(person2.adres);
        System.out.println(person2.phon);
        person2.olum(36);

        System.out.println("============");
        System.out.println(person1);

    }

}

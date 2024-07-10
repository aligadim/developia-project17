package ders_09;

public class Main {
    public static void main(String[] args) {
        Salary person1 = new Salary();
        person1.experience = 24;
        Salary person2 = new Salary();
        person2.experience = 35;

        Calculate calculate =new Calculate();
        System.out.println(person1.salary);
        calculate.calculateSalary(person1);
        System.out.println(person1.salary);
        System.out.println(person2.salary);
        calculate.calculateSalary(person2);
        System.out.println(person2.salary);


    }

}

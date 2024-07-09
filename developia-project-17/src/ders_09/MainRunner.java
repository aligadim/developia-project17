package ders_09;

public class MainRunner {
    public static void main(String[] args) {
        Person sen = new Person();
        sen.age=29;
        Person men = new Person();
        men.age = 25;

        SalaryColculatr salary = new SalaryColculatr();
        System.out.println(sen.salary);
        salary.calculateSalary(sen);
        System.out.println(sen.salary);
        System.out.println(men.salary);
        salary.calculateSalary(men);
        System.out.println(men.salary);
    }
}

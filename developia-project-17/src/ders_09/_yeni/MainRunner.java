package ders_09._yeni;

public class MainRunner {
    public static void main(String[] args) {
        Phon men = new Phon();
        men.age =34;
        Phon sen =new Phon();
        sen.age=45;

        priceCalculate right = new priceCalculate();
        System.out.println(sen.salary);
        right.calculateSalary(sen);
        System.out.println(sen.salary);

    }




}

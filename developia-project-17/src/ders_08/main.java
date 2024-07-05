package ders_08;

public class main {
    public static void main(String[] args) {
        People person =new People(4,"Ariz","Abdullayev",18,"Honor");
        People person2 = new People(5,"Ferhad","Memmedov",29,"Samsung");
        System.out.println(person.name);
        person.year(10);
        person2.year(15);

    }
}

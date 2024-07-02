package ders_07;

public class MainOOP {
    public static void main(String[] args) {
        phon iphone=new phon();
        iphone.model="Iphone pro";
        iphone.qiymet = 1500;
        iphone.ram = 4;
        iphone.qiymet(50);
        System.out.println(iphone.model);

        phon redmi = new phon();
        redmi.model = "Not 9pro";
        redmi.qiymet = 500;
        redmi.ram = 6;
        redmi.qiymet(50);

    }

}

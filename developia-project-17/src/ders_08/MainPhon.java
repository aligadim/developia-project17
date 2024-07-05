package ders_08;

public class MainPhon {
    public static void main(String[] args) {
        Phon phon1 = new Phon("Samsung",500);

        Phon phon2 = new Phon("iPhone",2500);
        System.out.println(phon1==phon2);
        System.out.println(phon1.price);
        phon1.charge();


    }
}

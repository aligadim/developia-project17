package ders6;

public class mesele2 {
    public static void main(String[] args) {
        int ededimiz = 389;
        int cem =0;
        while(ededimiz>0){
            int qaliq=ededimiz%10;
            cem+=qaliq;
            ededimiz =ededimiz/10;
        }
        System.out.println(cem);
    }
}

package ders6;

public class mesele4 {
    public static void main(String[] args) {
        int a=67849;
        int enBoyuk = 0;
        while(a>0){
            int qaliq=a%10;
            if(qaliq>enBoyuk){
                enBoyuk=qaliq;
            }
            a=a/10;

        }
        System.out.println(enBoyuk);


        int b = 4582;
        int enKicik=0;
        while(b>0){
            int qaliq1=b%10;
            if(qaliq1>enKicik){
                enKicik = qaliq1;

            }
           b= b/10;

        } System.out.println(enKicik);

        int f=87543;
        int boyuk = 0;
        while(f>0){
            int qaliq2 =f%10;
            if(qaliq2 > boyuk){
                boyuk=qaliq2;
            }
            f=f/10;



        }
        System.out.println(boyuk);
    }
}

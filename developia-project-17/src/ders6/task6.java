package ders6;

public class task6 {
    public static void main(String[] args) {
     for(int i=2;i<100;i++){
        boolean sade = true;
         for(int j=2;j<i;j++){
             if(i%j==0){
                 sade=false;

             }

         }
         if(sade) {
             System.out.println(i);
         }
     }
        System.out.println("--------------------------");

     int a = 7;
     int b = 10;
     int c= a+b;
        System.out.println(a+" + "+b+" = "+c);

        System.out.println("------------------------");

        int vurulan = 5;
        int vuran = 15;
        int hasil = vurulan * vuran;
        System.out.println(vurulan+" * "+vuran+" = "+hasil);

        System.out.println("------------------------");

        int r = 200;
        float u = 2*3.14f;

        int cem =(int) u*r;

        System.out.println(cem);
        System.out.println("------------------------");

        int e = 478;
        int sum = 0;
        while(e>0){
            sum= sum+(e%10);
            e=e/10;
        }

        System.out.println(sum);
         System.out.println("------------------------");

        int m=24;

        if(m%2==0){

            System.out.println("eded murehhebdir");
        }
       else {
            System.out.println("Eded Sadedir");
        }
        System.out.println("------------------------");

       int d = 98754;
       int enKicik = 9;
       while(d>0){
           int qaliq =d%10;
           if(qaliq<enKicik){
               enKicik=qaliq;
           }
           d=d/10;


       }
       System.out.println(enKicik);
        System.out.println("------------------------");

       int eb=6794;
       int enBoyuk = 0;
       while(eb!=0){
           int qaliq1=eb%10;
           if(qaliq1>enBoyuk){
               enBoyuk=qaliq1;

           }
           eb=eb/10;
       }
        System.out.println(enBoyuk);

        System.out.println("------------------------");

        int top = 53789;
        int cem2 = 0;
         while (top>0){
             int qaliq3 = top%10;
            cem2+=qaliq3;
             top=top/10;
         }

        System.out.println(cem2);

    }
}

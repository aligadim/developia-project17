package ders5;

public class operator3 {
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
           System.out.println(i);
       }
        System.out.println("==================");

       for(int k = 0; k<100; k++){
           if(k%5==0){
               System.out.println(k);
           }
       }
        System.out.println("==================");
       int sum = 0;
       for(int j = 0;j<500;j++){
           sum+=j;



       }
       System.out.println(sum);

        System.out.println("==================");
       for(int y=100;y>=30;y--){
           if(y%3==0){
               System.out.println(y);
           }
           System.out.println("==================");


       }


       for(int m = 1; m<20;m++){

           if(m%m==0 && m%1==0 && m%2!=0){
               System.out.println(m);
           }

        }
    }
}

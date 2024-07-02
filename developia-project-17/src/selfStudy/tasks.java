package selfStudy;

public class tasks {
    public static void main(String[] args) {
        int i =2345;
        int cem = 0;
        while(i>0){
            int qaliq = i%10;
            cem+=qaliq;
            i=i/10;
        }
        System.out.println(cem);
        System.out.println("===================");

        boolean  b=10==10.0;
        System.out.println(b);


       int x=0;
       int y =7;
       x=10/2+3%2;

        System.out.println(x);




    }
}

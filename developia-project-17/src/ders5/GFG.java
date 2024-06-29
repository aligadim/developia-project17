package ders5;
public class GFG {
    public static void main(String[] args) {
        int a = 10;
        int fib1 = 0;
        int fib2 = 1;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = fib1 + fib2;
            System.out.println(sum);
            fib1 = fib2;
            fib2 = sum;


        }

        int b = 20;
        int fiba1 = 0;
        int fiba2 = 1;
        int cem = 0;
        System.out.println("==================");
        for (int j = 0; j < b; j++) {
            cem = fiba1 + fiba2;
            System.out.println(cem);
            fiba1 = fiba2;
            fiba2 = cem;
        }

        System.out.println("==================");
        for (int c = 0; c < 100; c++) {
            if (c % 5 == 0) {
                System.out.println(c);
            }

        }
        System.out.println("==================");
        int netice = 0;
        for (int s = 0; s < 100; s++) {
            netice += s;
            System.out.println("netice: "+netice+" s: "+s);
        }
        int ne=0;
        for(int f = 400;f>20;f--){
            ne-=f;
            System.out.println("ne - "+ne+" f "+f);

        }

    }
}

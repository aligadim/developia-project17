package ders6;

public class MainBreak {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            System.out.println(i);
            if(i==6){
                break;
            }
        }

        for(int j = 0; j<10;j++){

            if(j==6){
                continue;
            }
            System.out.println(j);
        }
    }
}

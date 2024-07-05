import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon
public class Main {
    public static void main(String[] args) {

      String login = "admin123";
      String parol = "ali123";

      Scanner scan = new Scanner(System.in);
        System.out.println("Login daxil edin");
      String a = scan.next();
        System.out.println("Parol daxil edin");
      String b = scan.next();

      if (a.equals(login) && b.equals(parol)){
          System.out.println("Xos geldiniz");
      }else{
          System.out.println("Login ve ya parol sehvdir");
      }








    }
}
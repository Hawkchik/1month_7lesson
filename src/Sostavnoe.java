import java.util.Scanner;

public class Sostavnoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


     Prostoe function = new Prostoe();
        int a = scanner.nextInt();
      if (function.isprime(a)==1){
          System.out.println("Простое");

      }
      else System.out.println("Составное");

	}


    }


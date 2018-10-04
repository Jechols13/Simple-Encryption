import java.util.Scanner;

public class Tester {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, i will try to encrypt your text. Enter in a string to begin:");
        String plain = s.nextLine();

        Encrypt test = new Encrypt(plain,3);
        System.out.println("\nHere is your text encrypted:\n");
        System.out.println(test.oneTime());
    }
}

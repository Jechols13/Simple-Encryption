import java.util.Scanner;

public class Tester {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Encrypt test;
        System.out.println("Hello, this program will try to encrypt your text.\n" +
                "Please chose between the following options:\n" +
                "a) Caesar Substitution Method\n" +
                "b) One Time Pad Method\n" +
                "c) Exit");
        boolean keepGoing = true;
            while(keepGoing) {
                String input = s.nextLine();
                switch (input) {
                    case "a":
                        System.out.println("Please enter in some text. Alphabet characters only: ");
                        String x = s.nextLine();
                        test = new Encrypt(x, 3);
                        System.out.println("\nHere is your text encrypted via Caesar Substitution Cipher:");
                        System.out.println(test.Encryption());
                        System.out.println("\nMake another selection (a,b,c)");
                        break;
                    case "b":
                        System.out.println("Please enter in some text. Alphabet characters only: ");
                        String y = s.nextLine();
                        test = new Encrypt(y, 3);
                        System.out.println("\nHere is your text encrypted via One Time Pad encryption:");
                        System.out.println(test.oneTime());
                        System.out.println("\nMake another selection (a,b,c)");

                        break;
                    case "c":
                        keepGoing = false;
                        break;
                    default:
                        System.out.println("Invalid option, chose again.");
                }
            }
    }
}

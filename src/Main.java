import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        scanner.close();

        String vowels = "aAeEiIoOuU";

        if (Character.isLetter(letter)) {
            if (vowels.contains(String.valueOf(letter))) {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
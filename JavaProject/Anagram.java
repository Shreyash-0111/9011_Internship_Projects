import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words or strings of equal length:");

        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        sc.close();

        if (s1.length() != s2.length()) {
            System.out.println("Enter valid string or words...");
            return;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("The words " + s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println("The words " + s1 + " and " + s2 + " are not anagrams.");
        }
    }
}

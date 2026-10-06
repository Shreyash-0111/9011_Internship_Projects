import java.util.Scanner;

public class Voting_Age {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        sc.close();

        if (18 <= age && age < 100)
        {
            System.out.println("Your Age " + age+ " is valid");
            System.out.println("You are Eligible for Voting");
        }
        else{
            System.out.println("Invalid Age!!!! OR You are Under Age");
        }
    }
}

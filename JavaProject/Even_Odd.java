import java.util.Scanner;
public class Even_Odd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        sc.close();

        if ( x % 2 == 0)
        {
            System.out.print("The number is Even: " + x);
        }
        else 
        {
            System.out.print("The number is Odd: " + x);
        }
    }
}


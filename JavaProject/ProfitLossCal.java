import java.util.Scanner;

public class ProfitLossCal {
    
    void calculateProfitLoss(float cp,float sp)
    {
         if (cp == sp)
         {
            System.out.println("You have nither gain nor Loss.");
         }
        else if( sp > cp)
         {
            System.out.println("You have Profit of " + (sp-cp) + " units");
         }
         else {
            System.out.println("You have Loss of " + (cp-sp) + " units");
         }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ProfitLossCal cal = new ProfitLossCal();
        System.out.println("Enter Cost And Selling Price :");
        float costprice = sc.nextFloat();
        float sellingprice = sc.nextFloat();
        cal.calculateProfitLoss(costprice,sellingprice);
        sc.close();
    }
}

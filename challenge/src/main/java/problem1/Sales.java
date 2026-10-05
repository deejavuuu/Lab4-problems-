package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Salespeople: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSale = sales[0];
        int idOfMaxSale = 1;
        int minSale = sales[0];
        int idOfMinSale = 1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if(maxSale < sales[i]){
                maxSale = sales[i];
                idOfMaxSale = i + 1;
            }
            if(minSale > sales[i]){
                minSale = sales[i];
                idOfMinSale = i + 1;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage Sales: " + sum/sales.length);


        System.out.println("\nGreatest Sales Value: " + maxSale + "$ made by Salesperson: "+idOfMaxSale );
        System.out.println("\nLowest Sales Value: " + minSale + "$ made by Salesperson: "+idOfMinSale );
        System.out.print("Enter sales value: ");
        int salesInput = scan.nextInt();
        System.out.println("Salespeople with sale value greater than "+salesInput+"$");
        for(int i = 0; i< SALESPEOPLE; i++){
            if(sales[i]>salesInput){
                System.out.println("Salesperson: "+ (int)(i + 1)+" has sales of: "+sales[i]+"$");
            }
        }





    }
}
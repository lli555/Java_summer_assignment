// This program calculates the markup and the wholesale amount of a book sold
import java.util.Scanner;

public class Markup
{
   public static void main(String[]args)
   {
      //declarations
      double price = 0;
      double wholesale, markup;
      double percent = 1.1;
      double total_price = 0;
      double total_markup = 0;
      
      Scanner input = new Scanner(System.in);
      
      //perform calculations and display outputs; end when number is negative
      while (price >= 0)
      {
         //prompt the user for the price of a book
         System.out.println("Enter the price of a book: ");
         price = input.nextDouble();
         wholesale = Math.round(price / percent * 100.0) / 100.0;
         markup = Math.round((price - wholesale) * 100.0) / 100.0;
                  
         //display single outputs
         if (price >= 0)
         {
            //adding the total prices and markup
            total_price += price;
            total_markup += markup;
            System.out.println("The markup is $" + markup);
            System.out.println("The wholesale is $" + wholesale);
         }
      } 
      
      //display total prices and total markup amount
           System.out.println("Total markup: $" + total_markup);
           System.out.println("Total price: $" + total_price);

   }
}
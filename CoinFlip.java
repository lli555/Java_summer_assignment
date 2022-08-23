//This program simulates flipping a coin 100 times.

public class CoinFlip
{
   public static void main(String[]args)
   {
      //declarations
      int temp = 0;
      int heads = 0;
      int tails = 0;
   
      //simulate 100 times
      for (int i=0; i<100; i++)
      {
         //assign head to be 1 and tail to be 2
         temp = (Math.random() <= 0.5) ? 1 : 2; //if the random number generated is less than or equal to 0.5 then assign temp as 1, otherwise assign as 2
         if (temp == 1)
         {
            heads++;
         }
         else
         {
            tails++;
         }
      }
      
      //output the final number of heads and tails
      System.out.println("After 100 coin flips, you got:");
      System.out.println(heads + " Heads");
      System.out.println(tails + " Tails");
   }
}
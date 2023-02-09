/*
Name: Vlad Anisov
Date: 02/09/2023
Program description:

self-grade: Must explain the reasons for the given grade

Must change th name of  all the given methods otherwise you will lose points
*/
public class CookBookAnisov   //<------- chnage the name to a proper name and include your last name
{
   public static void main(String[] args)
   {
      System.out.println("----------------------------------------");
      System.out.println("This program displays the word COOKBOOK in the following format");
      System.out.println("----------------------------------------\n\n");
      draw();
   }
   /*
     Description : This method calls all the other methods to generate the provided output
   */
   public static void draw()
   {
      DisplayCC();
      DisplayOO();
      DisplayOO();
      DisplayKK();
      DisplayBB();
      DisplayOO();
      DisplayOO();
      DisplayKK();
   }
   
   /*
      Description: This method draws the letter C
   */
   public static void DisplayCC()    //<------ must change the name m1 to a proper name
   {
      System.out.println("CCCCCCCCC         CCCCCCCCC\nCC                CC\nCC                CC\nCC                CC\nCCCCCCCCC         CCCCCCCCC");
   }
   
   /* 
   Description: This method dispays the letter O
   */
   
   public static void DisplayOO()   // <------ must change the name m2 to a proper name
   {
      System.out.println(" OOOOOOOOO         OOOOOOOOO \nO          O      O          O\nO          O      O          O\nO          O      O          O\n OOOOOOOOO         OOOOOOOOO  ");
   }
   /*
   Description: This method displays the letter K
   */
   public static void DisplayKK()  // <------ must change the name m3 to a proper name
   {
      System.out.println("K    K             K    K\nK   K              K   K\nK  K               K  K\nK K                K K\nK  K               K  K\nK   K              K   K\nK    K             K    K");
   }
   /*
   Description: This method displays tthe letter B
   */
   public static void DisplayBB()    // <------ must change the name m3 to a proper name
   {
      System.out.println("BBBBBBB            BBBBBBB\nB     B            B     B\nB     B            B     B\nB    B             B    B\nBBBB               BBBB\nB    B             B    B\nB     B            B     B\nB     B            B     B\nBBBBBBB            BBBBBBB");
   }
}
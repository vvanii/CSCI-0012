/*
Name: Vlad Anisov
Date: 02/09/2023
Program description: Prints in big text letters the word "COOKBOOK"

self-grade: A, as I provided comments throughout the code and what it does, and the end result displays exactly as to what the prompt displayed
*/
public class CookBookAnisov   // my general class for the entire cookbook
{
   public static void main(String[] args) // this is the main method that displays draw() which holds all the letters
   {
      System.out.println("----------------------------------------");
      System.out.println("This program displays the word COOKBOOK in the following format");
      System.out.println("----------------------------------------\n\n");
      draw();
   }
   
   public static void draw() // this class contains all the letters in their order and displays them
   {
      letterC();
      letterO();
      letterO();
      letterK();
      letterB();
      letterO();
      letterO();
      letterK();
   }
   
   // This section of the code are letters in their own methods.

   /*
      Description: This method displays the letter C
   */
   public static void letterC()    
   {
      System.out.println("CCCCCCCCC         CCCCCCCCC\nCC                CC\nCC                CC\nCC                CC\nCCCCCCCCC         CCCCCCCCC");
   }
   
   /* 
   Description: This method displays the letter O
   */
   
   public static void letterO()   
   {
      System.out.println(" OOOOOOOOO         OOOOOOOOO \nO          O      O          O\nO          O      O          O\nO          O      O          O\n OOOOOOOOO         OOOOOOOOO  ");
   }
   /*
   Description: This method displays the letter K
   */
   public static void letterK()  
   {
      System.out.println("K    K             K    K\nK   K              K   K\nK  K               K  K\nK K                K K\nK  K               K  K\nK   K              K   K\nK    K             K    K");
   }
   /*
   Description: This method displays the letter B
   */
   public static void letterB()    
   {
      System.out.println("BBBBBBB            BBBBBBB\nB     B            B     B\nB     B            B     B\nB    B             B    B\nBBBB               BBBB\nB    B             B    B\nB     B            B     B\nB     B            B     B\nBBBBBBB            BBBBBBB");
   }
}
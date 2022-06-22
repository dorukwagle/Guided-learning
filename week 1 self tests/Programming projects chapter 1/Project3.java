/*
 * Write a program that starts with the string variable first set to your first name and the string variable 
 * last set to your last name.  Both names should be all lowercase.
 * Your program should then create a new string that contains your full name in pig 
 * latin with the first letter capitalized for the first and last name.  Use only the pig latin rule of 
 * moving the first letter to the end of the word and adding “ay.” Output the pig latin name to the screen.  
 * Use the substring and toUpperCase methods to construct the new name.

For example, given
first = "walt";
last = "savitch";
the program should create a new string with the text “Altway Avitchsay” and print it.
 */

public class Project3 {
   public static void main(String[] str){
      String first = "doruk";
      String last = "wagle";

      String firstPig;
      String lastPig;
      
      String pigLatin;
      //bring the first letter to last and add 'ay' at last and finally capitalize first letter
      firstPig = first.substring(1) + first.substring(0, 1) + "ay";
      firstPig = firstPig.substring(0, 1).toUpperCase() + firstPig.substring(1);
      
      lastPig = last.substring(1) + last.substring(0, 1) + "ay";
      lastPig = lastPig.substring(0, 1).toUpperCase() + lastPig.substring(1);

      pigLatin = firstPig + " " + lastPig;
      System.out.println(pigLatin);
   } 
}

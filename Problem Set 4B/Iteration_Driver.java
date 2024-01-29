
/**
 * Write a description of class Iteration_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Iteration_Driver{
    public static void main (String []args){
        //Testing palindromes...
        System.out.println("Is Palindrome: " + Iteration.Palindrome("A man, a plan, a canal: Panama."));
        
        //Testing PigLatin...
        System.out.println("Pig Latin: "+Iteration.pigLatin("I loVe StArcrAft"));
        
        //Testing Ascending Numbers
        System.out.println("Numbers: " + Iteration.ascendingNumbers(5000, 10000));
        
        //Testing Timestable
        System.out.println("Times Table: ");
        Iteration.timesTable(10);
        
    }
   
}


/**
 * Write a description of class Iteration here.
 *
 * @Alicia Tang
 * @version (a version number or a date)
 */
public class Iteration{
    //Question 1 Palindrome: completed
    public static boolean Palindrome(String word){ //non letters don't count
        word = word.toLowerCase();
        String nonLetters = ",.:;()[]{}!?@#$%^&* ";
        String str = "";
        //getting rid of non-letter characters
        for(int i = 0; i<word.length(); i++){
            String letter = word.substring(i,i+1);
            if (!nonLetters.contains(letter)){
                str = str+letter;
            }
        }
        //evaluating palindrome
        for(int i = 0; i<str.length();i++){
            char A = str.charAt(i);
            char B = str.charAt(str.length()-1-i);
            if(A!=B)return false;
        }
        return true;  
    }
    
    //Question 2 Pig Latin: Completed
    public static String pigLatin(String str){
        str = str.toLowerCase();
        String ans = "";
        while(str.length()>0){
            int space = str.indexOf(" ");
            if(space<0){
                ans += changeToPigLatin(str);
                str = "";
            }else{
                String newWord = str.substring(0,space);
                ans += changeToPigLatin(newWord) + " ";
                str = str.substring(space+1);
            }  
        }
        return ans;
    }
    
    public static String changeToPigLatin(String str){
        if(str.length() < 2) return str;
        char first = str.charAt(0);
        String rest = str.substring(1);
        return rest + first + "ay";
    }
    
    //Question 3 Strictly Ascending Number: Completed
    public static int ascendingNumbers(int start, int end){
        int count = 0;
        for(int i = start; i<end; i++){
           if(isAscending(i)) count++;
        }
        return count;
    }    
    public static boolean isAscending (int num){
        boolean ans = false;
        int temp1 = num%10;
        while(num>0){
            num = num/10;
            int temp2 = num%10;
            if(temp1 > temp2){
               ans = true; 
               temp1 = temp2;
            }else{
                return false;
            } 
        }  
        return ans;  
    }
    
    //Question 4 Times Table
    public static void timesTable(int n){
        int last = n*n;
        int totalDigits = digits(last);
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                int product = i*j;
                int space = totalDigits - digits(product);
                for(int k = space; k>=0; k--){
                    System.out.print(" ");
                }
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
    public static int digits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num = num/10;
        }
        return digits;
    }
}

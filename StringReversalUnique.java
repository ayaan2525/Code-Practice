import java.util.*;
 
class StringReversalUnique 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     int test = sc.nextInt();                 // Number of test cases
     String raw = sc.nextLine();
     
     while(test > 0) {
       test--;
       String str = sc.nextLine();           // Taking input string
       int[] arr = new int[26];              // Hashed array for checking if char present or not
       String output = "";
       
       for(int i = str.length()-1; i >= 0; i--) {  // Iterating from back
         char ch = str.charAt(i);
         
         if(ch == 32){                        // if white space ignore it
           continue;
         }
         
         if(arr[ch-'A'] == 0) {              // arr[char_index]= 0 means char encountered 1st time
           output = output + ch;             // Store arr[char_index] = 1 after appending it to o/p
           arr[ch-'A'] = 1;
         }
       }
     System.out.println(output);
     }
   }
}

// { Driver Code Starts
import java.util.*;
 
class RunLengthEncoding
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     sc.nextLine();
     
     while(T>0) {
       String str = sc.nextLine();
       Solution g = new Solution();
       System.out.println(g.encode(str));
       T--;
     }
   }
}
// } Driver Code Ends

class Solution
 {
 String encode(String str) {
   
   String output = "";
   int[] arr = new int[26];
   char prev = str.charAt(0);
   int count = 1;
   for(int i = 1; i < str.length(); i++) {
     char cur = str.charAt(i);
     if(cur == prev){
       count += 1;
     }
     else {
       output = output+prev+count;
       count = 1;
       prev=cur;
     }
   }
   output = output+prev+count;
   return output;
 }
}
 

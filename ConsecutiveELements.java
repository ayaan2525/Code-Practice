import java.util.*;

class ConsecutiveElements {
 public static void main (String[] args) {

     Scanner sc = new Scanner(System.in);
     int test = sc.nextInt();
     
     // just check if previous char is same as current or not if same continue
     //  else add prev to output and make current char as prev
     
     while(test > 0) {
       test--;
       String str = sc.next();
       String output = "";
       char prev = str.charAt(0);
       
       for(int i = 1; i < str.length(); i++) {
         char cur = str.charAt(i);
         if(cur == prev){
           continue;
         }
         else {
           output = output+prev;
           prev=cur;
         }
   }
   output = output+prev;
   System.out.println(output);
 }
}
 }


import java.util.Scanner;
import java.util.HashMap;

class DistinctSubstrings  {

  // Solved using HashMap by considering prev and current(like AB in ABCD) char present in map or not
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();          // Number of testcases
  
        while(test > 0) {
          test--;
          HashMap<String, Integer> map = new HashMap<>();
          String str = sc.next();
          int len = str.length();
          int count = 0;
          String prev = String.valueOf(str.charAt(0));   // Taking first char as prev
        
          for(int i = 1; i < len; i++) {
             String current = String.valueOf(str.charAt(i));  // current char
          
             if(map.containsKey(prev+current) == false) {     // check if prev+current present in map or not
               count += 1;                                 // if not increment count and put prev+current in map
               map.put((prev+current), 1);                    // assign current to prev for nxt substring
               prev = current;
             }
             else {                                        // if prev+current present in map make prev = current
               prev = current;
             }
          }
          System.out.println(count);
        }
  }
}

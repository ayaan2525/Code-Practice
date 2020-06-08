import java.util.Scanner;
import java.util.HashMap;

class RemoveDuplicates {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();                // Number of TestCases
    while(test>0) {
      
      test--;
      String str = sc.next();
      HashMap<Character, Integer> map = new HashMap<>();    // Hashmap to store each characters first count
      int len = str.length();
      for(int i = 0; i < len; i++) {
        char ch = str.charAt(i);
        if(map.containsKey(ch)) {                   // if character present in hashmap just continue
          continue;
        }
        else{
          map.put(ch,1);                           // character occuring first time, update Hashmap and print it
          System.out.print(ch);
        }
      }
      System.out.println();
    }
  }
}

import java.util.*;
import java.util.HashMap;
class LongestDistinctChars {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();          // Input Number of cases
    while(test>0) {
      test--;
      HashMap<Character, Integer> map = new HashMap<>();
      int max_length = 0;
      int current_count = 0;
      String str = sc.next();         // Input string
      int len = str.length();         // length of string
      for(int i = 0; i < len; i++) {
        char ch = str.charAt(i);
        if(map.containsKey(ch)) {     // if map conatins key compare max with present length and replace
          if(max_length < current_count) {
            max_length = current_count;
          }
          current_count = 0;                  // and make count=0 and start iterate from characters previous index
          i = map.get(ch);
          map.clear();
          
        }
        
        else {                        // if map not containing char store it in map with e=index
          map.put(ch,i);
          current_count += 1;
        }
      }
      if(max_length < current_count) {
        max_length = current_count;
      }
      System.out.println(max_length);
    }
  }
}

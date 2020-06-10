import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Anagram {
  
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in); 
    int test_cases = sc.nextInt();    // number of test_cases
    while (test_cases > 0) {
        test_cases--;
        
        String s1 = sc.next();  // first string
        String s2 = sc.next();  // second string
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2) {    // if length is not equal they are not anagram
          System.out.println("NO");
          continue;
        }
        else {
          HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();  // first map to store str1 and their char count
          HashMap<Character, Integer> map2 = new HashMap<Character, Integer>(); // second map to store str2 and their char count
          
          for(int i=0; i < len1; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map1.containsKey(ch1)) {                       // if map contains already char increment the count
              map1.put(ch1,map1.get(ch1)+1);
            }
            else {                                            // if map not contain char store it with count 1
              map1.put(ch1,1);
            }
            if(map2.containsKey(ch2)) {
              map2.put(ch2, map2.get(ch2)+1);
            }
            else {
              map2.put(ch2,1);
            }
          }
        
           if(map1.equals(map2)) {              // compairing both maps after storing each char and its count
             System.out.println("YES");
           }
           else {
             System.out.println("NO");
           }
           }
  }
}
}

           

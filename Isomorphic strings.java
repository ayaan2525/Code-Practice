import java.util.*;
import java.util.HashMap;

class IsomorphicStrings {
  
  // java program to check two strings are isomorphic or not using HashMap technique
  
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in); 
    int test_cases = sc.nextInt();    // number of test_cases
    while (test_cases > 0) {
        test_cases--;
        
        String s1 = sc.next();        // first string s1
        String s2 = sc.next();        // first string s2
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2) {            // If length of s1, s2 not equal they are not isomorphic
          System.out.println(0);
          continue;
        }
        boolean flag = true;
        HashMap<Character, Character> KVmap = new HashMap<>();   // this map store s1 as key and s2 value
        HashMap<Character, Character> VKmap = new HashMap<>();   // this map store s2 as key and s1 as value 
        for(int i = 0; i < len1; i++) {
          char ch1 = s1.charAt(i);
          char ch2 = s2.charAt(i);
          
          // Logic: If KVMap contains ch1 as key already in KVmap then ch2 should equal to (ch1's value)
          //  for mapping
          
          if(KVmap.containsKey(ch1)) {         
            if(ch2 != KVmap.get(ch1)) {
              flag = false;
              break;
            }
          }
          
          // If ch2 is stored as value to some key then ch1 should be there as ch2's key in VKmap
          
          if(KVmap.containsValue(ch2)) {
            if(VKmap.get(ch2) != ch1) {
              flag = false;
              break;
            }}
          
         // if not present as key valye in both map stored them as
          KVmap.put(ch1, ch2);
          VKmap.put(ch2,ch1);
        }
        if(flag == true) {
                    System.out.println(1);
        }
        else{
                    System.out.println(0);
        }
    }
  }
}

import java.util.*;
import java.util.HashMap;
class SecondMostRepeatedWord {
  
  // Solution using HashMap
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();          // Input Number of Test Cases
    while(test>0) {
      test--;
      HashMap<String, Integer> map = new HashMap<>();
      int max = 0;                   // Max to store most repeated word frequency
      int secondMax= 0;              // SecondMax to store 2nd most repeated word frequency
      int count = 0;
      String output = " ";
      int len = sc.nextInt();
      String str[] = new String[len];
      for(int i = 0; i < len; i++) {
        str[i] = sc.next();         // taking input as String array;
      }
      String words[] = new String[len];    // Secong string array to store word for finding secondMax word
      for(int i = 0; i < len; i++) {     // Loop to store word and their frequency
        String word = str[i];
        if(map.containsKey(word)) {     
          map.put(word, map.get(word)+1);
        }
        else {
          map.put(word, 1);
          words[count] = word;
          count++;
        }
        if(max < map.get(word)) {     // Calculating max frequency of most repeated word
          max = map.get(word);
        }
      }
      for(int i = 0; i < count; i++) {    // Finding SecondMax repeated word with 
        if((map.get(words[i]) < max) && (map.get(words[i]) > secondMax)) {
          secondMax = map.get(words[i]);
          output = words[i];
          }
      }
      System.out.println(output);
    }
    
    }
}
 
    



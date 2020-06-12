import java.util.Scanner;
import java.util.HashMap;
class RomanToInteger {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test>0) {
      test--;
      // Rule if symbol appears after largeror equal symbol its added(e.g. VI = 5 + 1 = 9
      // if symbol appears before larger its subtracted(e.g. IX = 10 - 1 = 9)
      
      HashMap<Character, Integer> map = new HashMap<>();  // To store roman number as key value('V':5, 'L':50)
      map.put('I',1); map.put('V',5); map.put('X',10); map.put('L',50); map.put('C', 100); map.put('D',500); map.put('M',1000);
      String roman = sc.next();
      int len = roman.length();
      int number = 0;
      int value = 0;                      // Current roman number value 
      int value_next = 0;                 // next roman number value for applying rule 
      int i;
      for(i=0;i<len;i++) {
        char c = roman.charAt(i);
        value = map.get(c);
        if(i < len-1){
          char next_c = roman.charAt(i+1);         // Next symbol
          value_next = map.get(next_c);            // next symbol value
          if(value >= value_next) {               // if current symbol value >= add it to number else subtract
            number += value;
          }
          else{
            number -= value;
          }
        }
      }
      number += value;
      System.out.println(number);
    }
  }
}

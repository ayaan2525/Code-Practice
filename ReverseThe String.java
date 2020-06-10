import java.util.*;
class ReverseWords {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();          // Input Number of cases
    while(test>0) {
      test--;
      int sum = 0;
      String str = sc.next();         // Input string
      int len = str.length();
      String word = "";
      for(int i = len-1; i >= 0; i--) {
        char ch = str.charAt(i);
        if(ch != '.') {
          word = String.valueOf(ch)+word;
        }
        else {
          System.out.print(word+".");
          word = "";
        }
      }
      System.out.println(word);
    }
  }
}

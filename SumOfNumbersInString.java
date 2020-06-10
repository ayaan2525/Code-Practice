import java.util.*;
class SumOfNumInString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();          // Input Number of cases
    while(test>0) {
      test--;
      int sum = 0;
      String str = sc.next();         // Input string
      int len = str.length();
      for(int i = 0; i < len;i++) {
        char ch_i = str.charAt(i);
        
        if((ch_i >= 48) && (ch_i <=57)) {           // If character found look for successive number
          String successive_num = String.valueOf(ch_i);
          int count = 0;
          for(int j = i+1; j < len;j++) {           // Loop for successive numbers
            count+=1;
            char ch_j = str.charAt(j);
            if((ch_j >= 48) && (ch_j <=57)) {       // If successive Num found add them like("2"+"3")
              successive_num = successive_num + String.valueOf(ch_j); 
            }
            else {
              break;
            }
          }
          i=i+count;
        
          sum += Integer.parseInt(successive_num);             // Parse the string and it to Sum
        }
      }
      System.out.println(sum);
    }
  }
}
            

          


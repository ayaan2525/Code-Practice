import java.util.*;

class BinaryAddition {
  
  // Solved by counting 1's in both string and carry 
  // if count1's > 1 then carry = 1 for next step
  // if count1's > 2 or count11's == 1 then current addition result=1 else 0 and append it output
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        
        while(test > 0) {
          test--;
          String str1 = sc.next();
          String str2 = sc.next();
          int len1 = str1.length()-1;
          int len2 = str2.length()-1;
          int count = 0; int carry = 0;
          String currentResult = "";
          String output = "";
          
          while(len1 >= 0 || len2 >= 0) {
            
            if(len1 >= 0){
              
              if(str1.charAt(len1) == '1')
                count++;
            }
            if(len2 >= 0){
              
              if(str2.charAt(len2)=='1')
                count++;
              
            }
            if(carry == 1) {
              count++;
            }
            
            carry = (count > 1) ? 1 : 0;
            currentResult = (count > 2 || count == 1) ? "1" : "0"; 
            output = (currentResult + output);
            count = 0;
            len1--;
            len2--;
          }
          
          if(carry==1) {
            output = ("1"+output);
        }
          System.out.println(output);
        }
  }
}
            
            

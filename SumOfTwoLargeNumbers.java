import java.util.Scanner;
import java.math.BigInteger;
class SumOfTwoLargeNum {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();               // Input Number of TestCases
    while(test > 0) {
      test--;
      String X = sc.next();                // taking input as string in x and y
      String Y = sc.next();                // because of large size
      int len_X = X.length();              // Taking length of X
      
      // Converting x and to BigIntegars and adding with add function of BigInteger class
      
      BigInteger sum = new BigInteger(X).add(new BigInteger(Y));           
      int len_sum = String.valueOf(sum).length();
      
      if(len_sum == len_X) {               // comparing length if SUM of and X
        System.out.println(sum);
      }
      else{
        System.out.println(X);
      }
    }
  }
}


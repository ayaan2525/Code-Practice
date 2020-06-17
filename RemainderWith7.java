import java.util.*;
import java.math.BigInteger;

class RemainderWith7
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  sc.nextLine();
  while(t>0)
  {
   String str = sc.nextLine();
   Solution g = new Solution();
   System.out.println(g.remainderWith7(str));
  t--;
  }
 }
}// } Driver Code Ends


class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
      BigInteger n = new BigInteger(num);
      int rem = n.remainder(BigInteger.valueOf(7)).intValue();
      return rem;
    }
}



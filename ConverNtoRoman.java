import java.util.Scanner;

class ConvertToRoman {
  
  public static void main(String args[]) {  
        String romans[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int nums[]      = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
          test--;
          String result = "";
          int myNum = sc.nextInt();
          
          for(int i=12; i>=0; i--)
            {
            while(myNum>=nums[i])
              {
                  result = result + romans[i];
                  myNum = myNum - nums[i];
              }
          }
          System.out.println(result);
        }
}
}


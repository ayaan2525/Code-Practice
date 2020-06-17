import java.util.Scanner;

class SaveIronman {
  
  public static void main(String args[]) {
    
    Scanner sc =  new Scanner(System.in);
    int test =  sc.nextInt();       // Input num of testCases
    String raw = sc.nextLine();
    
    while(test > 0) {
      test--;
      String str = sc.nextLine().toLowerCase();    // convert string to lowercase
       
      //replace all spcial char ans whitespace by ""
      String str1 = str.replaceAll("[()?:!.,;{}]+\\s", " ").replaceAll("\\s","");  
      int len = str1.length();
      boolean flag = true;

      for(int i = 0; i < len/2; i++) {            // Loop to iterate from front as well as back
        if(str1.charAt(i) != str1.charAt(len-i-1)) {    // if character not matched break from loop
          flag = false;
        }
      }
      if(flag==true) {
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
    }
  }
}
}


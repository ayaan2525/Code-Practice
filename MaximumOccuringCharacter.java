import java.util.Scanner;

class MaximumOccuringCharacter  {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();  // Number of test cases
    
    while(test > 0) {
      test--;
      String str = sc.next();
      int[] arr = new int[26];
      
      for(int i=0; i < str.length(); i++) {       // Storing each char count in hashed array:a at 0, b at 1 ,..
        char ch = str.charAt(i);
        arr[ch-'a'] = arr[ch-'a'] + 1;
      }
      int max = 0;
      int index = 0;
      for(int i= 0; i < 26; i++) {      // Calculating max count index with value y
        if(max < arr[i]) {              // if two char count are same it will store lexicographically
          max = arr[i];
          index = i;
        }
      }
      System.out.println((char)(index+'a'));
    }}
}

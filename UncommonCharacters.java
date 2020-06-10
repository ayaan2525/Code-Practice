import java.util.*;
class UncommonCharacters {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();          // Input Number of cases
    while(test>0) {
      test--;
      String str1 = sc.next();         // Input string
      String str2 = sc.next();         // Input string
      int len1 = str1.length();
      int len2 = str2.length();
      int letters1[] = new int[26];    // Hashed array to store first string char count "arr[0]=a,arr[1]=b,.."
      int letters2[] = new int[26];    // Hashed array to store second string char count
      
      
      for(int i = 0; i < len1; i++) {
        char ch = str1.charAt(i);
        letters1[ch-'a']=1;            // Increment index 
      }
      for(int i = 0; i < len2; i++) {
        char ch = str2.charAt(i);
        letters2[ch-'a']=1;
      }
        
      for(int i = 0; i < 26; i++) {    // comparing index of both hashed array if 
                                       // one is 0 and other is 1 it means its uncommon
        
        if((letters1[i]>0 && letters2[i]==0) || (letters1[i]==0 && letters2[i]>0))  {
          System.out.print((char)(i+'a'));
        }
      }
      System.out.println();
    }
  }
}

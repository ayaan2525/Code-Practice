import java.util.*;
import java.io.*;
import java.lang.*;

class DriverMissingPanagram
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str = read.readLine();
            System.out.println(new MissingPanagram().missingPanagram(str));
        }
    }
}// } Driver Code Ends

class MissingPanagram
{
    // Complete the function
    // str: input string
    public static String missingPanagram(String str)
    {
        // Find and return the missing characters
        // to complete Panagram string
      str = str.toLowerCase();
      String ans = "";
      int[] arr = new int[26];
      for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        arr[ch-'a'] = 1;
      }
      for(int i = 0; i < 26; i++) { 
         if(arr[i] == 0) {
           ans = ans + (char)(i+'a');
         }
      }
    return ans;
    }
}

       



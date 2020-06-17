// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValidIP(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValidIP(String s) {
        // Write your code here
        boolean flag = true;
        if(s.charAt(s.length()-1)=='.'){     //if last char == '.' e.g. 1.2.3.4.
            return false;
        }
        
        String[] str = s.split("\\.");      // split the address by "."
        
        if(str.length != 4) {                // if length is not 4
         return false;                       // e.g. 1..2 or 1.23.25 or 1.2.3.4.5      
        }
        for(int i = 0; i < 4; i++) {
            String address = str[i];        // current address char like 12 of 12.145.255.255
            int len = address.length();
            
            if(len > 3 || len == 0) {       // if len > 3 or 0 invalide
              flag = false;                 // e.g. 1111.2.3.4 or 1..2
                break;
            }
            
            if(len > 1 && address.charAt(0) == '0') {      // first char should not be 0
              flag = false;                                // e.g. 012 in 012.1.23.45
                break;
            }
            
            if(len > 1 && (Integer.parseInt(address) > 255 || Integer.parseInt(address) < 0)){
                flag = false;
                break;
            }
             // Special case for input like a.b.c.d 
            try {
              
            if(len == 1 && (Integer.parseInt(address) < 0 || Integer.parseInt(address) > 9)) {
            flag = false;
            break;}
            }
            catch(Exception e) {
                flag = false;
                break;
            }
      }
      return flag;
    }
}

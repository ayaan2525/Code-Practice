import java.util.*;
import java.lang.*;
import java.io.*;
class ClosestString {
 public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     int t = scan.nextInt();
     while(t-- > 0){
         int n = scan.nextInt();
         String st = scan.nextLine().trim();
         if(st.isEmpty())
             st = scan.nextLine().trim();
         String s1 = scan.next();
         String s2 = scan.next();
            String s[] = st.split(" ");
            int a=0,b=0;
            int flag1 = 0,flag2 = 0;
            int minimum = Integer.MAX_VALUE;
            if(s1.equals(s2))
                System.out.println("0");
            else{
                for(int i=0;i<s.length;i++){
                    if(s[i].equals(s1)){
                        a = i;
                        flag1 = 1;
                    }
                    else if(s[i].equals(s2)){
                        b = i;
                        flag2 = 1;
                    }
                    if(flag1 == 1 && flag2 == 1){
                        minimum = Math.min(minimum,Math.abs(a-b));
                    }
                }
                System.out.println(minimum);
            }
     }
 }
}

import java.util.Scanner;

class GoodOrBadString {
 
 //First consider ? as vowel and count contiguous vowels then take ? as consonent and count contiguous consonent 
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int test = sc.nextInt();
     while(test-- > 0){
         String str = sc.next();
         int countV = 0;
         int countC = 0;
         boolean flag = true;
         for(int i = 0; i < str.length(); i++) {
           char chV = str.charAt(i);
           
           if(chV == 'a' || chV == 'e' ||chV == 'i' ||chV == 'o' ||chV == 'u' || chV == '?') {
             countV += 1;
             if(countV > 5) {
               flag = false;
               break;
         }
           }
           else{
             countV=0;
         }
         }
         if(flag == false) {
           System.out.println(0);
           continue;
         }
         
         for(int i = 0; i < str.length(); i++) {
           char chC = str.charAt(i);
           if(chC == 'a' || chC == 'e' ||chC == 'i' ||chC == 'o' ||chC == 'u') {
             countC = 0;
           }
           else{
             countC++;
             if(countC > 3) {
               flag = false;
               break;
             }}
         }
         if(flag == false) {
           System.out.println(0);
         }
         else{
           System.out.println(1);
         }
     }
 }
}

import java.util.*;
import java.util.LinkedHashMap;

class FirstNonRepeated {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
          test--;
          LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
          int len = sc.nextInt();
          String str = sc.next();
          char arr[] = new char[26];
          int count = 0;
          for(int i = 0; i < len; i++) {
             char ch = str.charAt(i);
             if(map.get(ch) == null) {
               map.put(ch,1);
               arr[count] = ch;
               count+=1;
             }
             else{
               map.put(ch, map.get(ch)+1);
             }
          }
          boolean flag = false;
          char nonRepeat = ' ';
          for(int i = 0; i < count; i++) {
            if(map.get(arr[i]) == 1){
              nonRepeat = arr[i];
              flag = true;
              break;
            }
          }
          if(flag == true) {
            System.out.println(nonRepeat);
          }
          else{
            System.out.println(-1);
          }
          }
}
}

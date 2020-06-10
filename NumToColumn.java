import java.util.Scanner;

class NumberToColumn {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();    
    while(test>0) {
      
      test--;
      long colNum = sc.nextLong();  
      String column = "";
      while(colNum > 0) {
        
      long quotient = colNum / 26;  
      long remainder = colNum % 26;
      colNum = quotient;
      char character=' ';
      if(remainder == 0) {
        character = 'Z';
        colNum = colNum-1;
      }
      else {
        character = (char)(int)(remainder + 64);
      }
      column = (String.valueOf(character) + column);
      }
      System.out.println(column);
    }}}

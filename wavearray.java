import java.io.*;
class ArrayWave {
  public static void main(String args[])throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int test = Integer.parseInt(br.readLine());
    while(test > 0) {
        
        test--;
        int length = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        
        for(int i=1; i<length; i+=2) {
            
            String temp = input[i-1];
            input[i-1] = input[i];
            input[i] = temp;
        }
        for(int i=0; i<length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        
}
}
}

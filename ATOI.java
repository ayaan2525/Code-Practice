import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			GfG g = new GfG();
			System.out.println(g.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */
class GfG
{
    int atoi(String str)
    {
	// Your code here
	    int len = str.length();
        boolean flag = true;
        int ans;
        int i = 0;
        if(str.charAt(0) == '-') {
            i = 1;
        }
        for(; i< len; i++) {
            char ch = str.charAt(i);
            if((ch >= 48) && (ch <= 57)) {
                continue;
            }
            else {
              flag = false;
              break;
            }
          }
        if(flag == false) {
           ans =  -1;
        }
        else {
           ans = Integer.parseInt(str);
          }
          return ans;
        }
    }



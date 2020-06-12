
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-- > 0)
	    {
	        int n=Integer.parseInt(br.readLine());
	        String dict[]=br.readLine().split(" ");
	        String s=br.readLine();
	        int maxlen=0;
	        int maxI=0;
	        int len=0;
	        int fre[]=new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            char ch =s.charAt(i);
	            int j=ch-'a';
	            fre[j]++;
	        }
	        for(int i=0;i<dict.length;i++)
	        {
	            String s1=dict[i];
	            int fre1[]=new int[26];
	            for(int j=0;j<s1.length();j++)
	            {
	                char ch=s1.charAt(j);
	                int k=ch-'a';
	                fre1[k]++;
	            }
	            for(int j=0;j<s1.length();j++)
	            {
	                char ch=s1.charAt(j);
	                int k=ch-'a';
	                if(fre[k]>=fre1[k])
	                {
	                    len++;
	                }
	                else
	                {
	                    break;
	                }
	            }
	            if(len>maxlen)
	            {
	                maxlen=len;
	                maxI=i;
	                len=0;
	            }
	        }
	        System.out.println(dict[maxI]);
	    }
		
	}
}

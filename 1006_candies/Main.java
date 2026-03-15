import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    boolean b = false;
		    int n = sc.nextInt();
		    
		    int a[] = new int[2*n];
		    
		    for(int i=0;i<a.length;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    
		    
		    for(int i=0;i<a.length;i++)
		    {
		        int c=0;
		        int x = a[i];
		        
		        for(int j=0;j<a.length;j++)
		        {
		            if(x == a[j])
		            {
		                c++;
		            }
		        }
		        
		        if(c>2)
		        {
		            b = true;
		            break;
		        }
		    }
		    if(b)
		    {
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}

	}
}

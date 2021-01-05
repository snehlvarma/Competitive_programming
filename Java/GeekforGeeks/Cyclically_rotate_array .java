
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	int t,n,i;
	Scanner s1=new Scanner(System.in);
	t=s1.nextInt();
	while(t>0)
	{
	n=s1.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	for(i=0;i<n;i++)
	{
	    a[i]=s1.nextInt();
	}
	for(i=0;i<n;i++)
	{
	    if(i<n-1)
	    {
	    b[i+1]=a[i];
	    }
	    else
	    {
	        b[0]=a[n-1];
	    }
	}
	    for(i=0;i<n;i++)
	    {
	        System.out.print(b[i]+" ");
	    }
	System.out.print("\n");
	t--;
	}
	}
}

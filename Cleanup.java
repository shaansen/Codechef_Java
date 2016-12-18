 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class CleaningUp
{
	static void printList(List l)
	{
		
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
	}
	
	static void func(int num[])
	{
		
		List l1=new LinkedList();
		List l2=new LinkedList();
		int count1=0;
		int count2=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]==0&&count1==count2)
			{
				l1.add(i+1);
				count1++;
			}
			else if(num[i]==0&&count1>count2)
			{
				l2.add(i+1);
				count2++;
			}
		}
		printList(l1);
		printList(l2);
		
	}
	
 public static void main (String[] args) throws java.lang.Exception
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  int tc=Integer.parseInt(br.readLine());
  
  for(int i=0;i<tc;i++)
  {
     String s[]=br.readLine().split(" ");
     int n=Integer.parseInt(s[0]);
     int m=Integer.parseInt(s[1]);
    
     String s1[]=br.readLine().split(" ");
     int num2[]=new int[n];
     
     for (int j = 0; j < m; j++) {
		int l=Integer.parseInt(s1[j]);
		num2[l-1]=l;
	}
    
     func(num2);
 
     
  }
 }
} 
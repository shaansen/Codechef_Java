import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
public class Main
{
	
	static void func(int a,int b)
	{
		int diff=a-b;
		
		int l=diff-((diff/10)*10);
		if(l==9)
		{
			System.out.println(diff-1);
		}
		else
		{
			System.out.println(diff+1);
		}
		
	
		
	}
	
 
public static void main (String[] args) throws java.lang.Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String[] temp=br.readLine().split(" ");
	int a=Integer.parseInt(temp[0]);
	int b=Integer.parseInt(temp[1]);
	
	func(a,b);
	}
} 
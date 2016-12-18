import java.util.*;
import java.io.*;
 
class HORSES {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int tc=sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			int size=sc.nextInt();
			int[] a=new int[size];
			
			for (int j = 0; j < size; j++) {
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			int min=Integer.MAX_VALUE;
			for (int j = 0; j < size-1; j++) {
				int diff=a[j+1]-a[j];
				if(diff<min)
				{min=diff;}
			}
 
			out.println(min);
			
			
			
		}
		out.close();
		
		
	}
 
}
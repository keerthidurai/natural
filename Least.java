import java.util.Scanner;
public class Stringg
{
 public static void main(String args[])
 {
	 Scanner s=new Scanner(System.in);
	 String str=s.next();
	 int l=str.length();
	 int k=s.nextInt();
	 int j[]=new int[l];
	 int i;
	 for( i=0;i<str.length();i++)
	{
		 j[i]=Character.digit(str.charAt(i), 10);
	}	 
		 Arrays.sort(j);
			for(int m=0;m<l-k;m++)
			{
				System.out.print(j[m]);
			}
	}
 
}

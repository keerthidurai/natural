class Fibnnoci
{
    public static void main(String args[])
    {
       int n1=-1,n2=1;int n3=0;
	       Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       for(int i=0;i<n;i++)
	       {
	          n3=n1+n2;
	          n1=n2;
	          n2=n3;
	          System.out.print(n3);
	          System.out.print(" ");
	       }
     }
}
       

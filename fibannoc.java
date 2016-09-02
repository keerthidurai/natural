public class Fibannoc 
{
    public static void main(String[] args)
	    {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int f1=0,f2=1,f3=0;
          for(int i=0;i<n;i++)
            {
              	f3=f1+f2;
              	f1=f3;
              	f2=f3;
              	System.out.print(f3);
              	System.out.print(" ");
            }
      }
}

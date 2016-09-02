class Floyds
{
public static void main(String args[])
   {
      int n,i,j;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for (i=1;i<=n;i++ )
      {
         for (j=1;j<=i;j++ )
         {
            System.out.print(" ");
          
         }
         System.out.println();
      }
   }
}

class Test
{
    public static void main(String args[])
    {
    	int i=1,sum=0;
        System.out.println("the natural no count till howmany consecutive numbers");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         for(i=1;i<=n;i++)
         {
           sum=sum+i;
         }
        System.out.println(sum); }
}
      

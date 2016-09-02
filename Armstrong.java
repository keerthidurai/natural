class Armstrong
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
	    int n,temp,d,sum=0;
	    System.out.println("Enter the no:");
	    n=in.nextInt();                       
	    temp=n;
	    while(temp!=0)
	    {
	        d=temp%10;                  
	        sum=sum+d*d*d;
	        temp=temp/10;
	     }
	     if(n==sum)
	         System.out.println("Armstrong Number");
	     else
	System.out.println("Not an Armstrong Number");
   
    }
}

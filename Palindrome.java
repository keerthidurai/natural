class Palindrome
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0,ad=0;
      int temp=n;
      while(temp!=0)
      {
      ad=temp%10;
      sum=sum*10+ad;
      temp=temp/10;
      }
      if(n==sum)
      {
    System.out.println("palinrome",sum);
    }
    else
    {
    System.out.println("not a palindrome");
    }
    }
    }
    
      
      

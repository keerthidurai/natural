class Palindrome
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      intsum1=0,sum=0,ad=0;
      int[] ar=new ar[n];
      for(int i=0;i<n;i++)
      {
          ar[i]=s.nextInt();
          sum1=sum1+ar[i];
      }
      int temp=sum1;
      while(temp!=0)
      {
      ad=temp%10;
      sum=sum*10+ad;
      temp=temp/10;
      }
      if(sum1==sum)
      {
    System.out.println("palinrome",sum);
    }
    else
    {
    System.out.println("not a palindrome");
    }
    }
    }

class Pascal
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r =s.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int k=r;k>i;k--)
            {
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0;j<=i;j++)
            {
 
                 System.out.print(number+" ");
                 number = number * (i - j) / (j + 1);
                  
            }
            System.out.println();
        }
 
    }
}

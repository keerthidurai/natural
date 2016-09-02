class Largest
{
public static void main(String args[])
{
    int a=0,b=0,c=0;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if(a>b && a>c)
     System.out.println("a is greater");
    else if(b>c)
    System.out.println("b is greater");
    else
    System.out.println("c is greater");
}
}

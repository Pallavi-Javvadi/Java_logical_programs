import java.util.Scanner;
class Big
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter a value:");
int a=s.nextInt();
System.out.println("enter b value:");
int b=s.nextInt();
System.out.println("enter c value:");
int c=s.nextInt();


if(a>b)
{
if(a>c)
{
System.out.println("a is big");
}
else
{
System.out.println("c is big");
}
}
else
{
if(b>c)
{
System.out.println("b is big");
}
else
{
System.out.println("c is big");
}
}
}
}


import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter a number:");
int n=s.nextInt();

if(n%2==0)
{
System.out.println("given number is EVEN");
}
else
{
System.out.println("given number is ODD");
}
}
}

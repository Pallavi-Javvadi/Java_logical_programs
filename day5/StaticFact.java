import java.util.Scanner;
class Factorial
{
static int f=1,i;
static void fact()
{

Scanner s=new Scanner(System.in);
System.out.println("enter a value:");
int a=s.nextInt();

i=1;
while (i<=a)
{
f=f*i;
i++;
}
System.out.println("factorial of a number:"+f);
}
}

class StaticFact
{
public static void main(String []args)
{
Factorial.fact();
}
}
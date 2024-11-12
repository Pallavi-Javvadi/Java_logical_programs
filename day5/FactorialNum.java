import java.util.Scanner;
class Factorial
{
int f=1,i,a;
int fact()
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
return f;
}
}

class FactorialNum
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int r;
//System.out.println("enter a value:");
//int n=s.nextInt();
Factorial f1=new Factorial();
r=f1.fact();
System.out.println("factorial of a number:"+r);

}
}
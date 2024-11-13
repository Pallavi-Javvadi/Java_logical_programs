import java.util.Scanner;
class A
{
Scanner s=new Scanner(System.in);
int n;
void read()
{
System.out.println("enter a value :");
n=s.nextInt();
}
}

class B extends A
{
void fact()
{
int f=1,i;
for(i=1;i<=n;i++)
f=f*i;
System.out.println("factorialof a number:"+f);
}
}
class C extends A
{
void sum()
{
int s=0,i;
for(i=1;i<=n;i++)
{
s=s+i;
}
System.out.println("sum of n numbers :"+s);
}
}
class Heirarical
{
public static void main(String []args)
{
B b1=new B();
C c1=new C();
b1.read();
b1.fact();
c1.read();
c1.sum();
}
}


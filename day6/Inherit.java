class Base
{
int c;

int a=10;
int b=20;

void add()
{
c=a+b;
System.out.println("the addition is :"+c);
}
}
class Derive extends Base
{
int d;
void mul()
{
d=a*b;
System.out.println("multuiplication :"+d);
}
}
class Inherit
{
public static void main(String [] args)
{
Derive d1=new Derive();
d1.add();
d1.mul();
}
}

class Addition
{
int a,b,c;
Addition()
{
System.out.println("non parametarized");
}
Addition(int a)
{
System.out.println("the given value is"+a);
}
Addition(int a,int b)
{
c=a+b;
System.out.println("the given value is"+c);
}
}
class Overload
{
public static void main(String[] args)
{
int m=76,n=23;
Addition a=new Addition();
Addition a1=new Addition(m);
Addition a2=new Addition(m,n);
}
}
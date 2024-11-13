class Addition
{
int a,b,c;
Addition(int a,int b)
{

c=a+b;
System.out.println("the Addition value is:"+c);
}
}
class Constructor
{
public static void main(String[] args)
{
int m=76,n=23;
Addition a=new Addition(m,n);
}
}
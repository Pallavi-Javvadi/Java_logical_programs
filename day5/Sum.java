class Addition
{
int a=10,b=20,sum;

void add()
{
sum=a+b;
System.out.println("sum of the numbers:"+sum);
}
}

class Sum
{
public static void main(String []args)
{
Addition a1=new Addition();
a1.add();
}
}
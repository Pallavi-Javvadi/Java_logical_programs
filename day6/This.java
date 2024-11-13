class Addition 
{
int a=199;
void demo()
{
int a=2888;
System.out.println("thye value in instance is:"+this.a);
System.out.println("thye value in local is:"+a);
}
}
class This
{
public static void main(String []args)
{
Addition a=new Addition();
a.demo();
}
}
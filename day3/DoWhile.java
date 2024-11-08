import java.util.Scanner;
class DoWhile
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=1,n;
System.out.println("enter a value");
n=s.nextInt();
do
{
System.out.println(i);
i++;
}while(i<=n);
}
}
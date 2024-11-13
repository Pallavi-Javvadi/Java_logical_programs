import java.util.Scanner;
class ArrayNegative
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i;
System.out.println("enter number of array values");
int n=s.nextInt();

int a[]=new int[n];

System.out.println("enter array values");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println(" the array negative elements are:");
for(i=0;i<a.length;i++)
{
if(a[i]<0)
System.out.println(a[i]);
}
}
}
import java.util.Scanner;
public class Deletion
{
public static void main(String[] args)
{
int[] a = new int[50];
Scanner s = new Scanner(System.in);
System.out.println("enter the size of an array and elements");
int n = s.nextInt();
System.out.println("enter the  array  elements");
for(int i=0; i<n; i++)
{
a[i] = s.nextInt();
}
System.out.println("ARRAY ELEMENTS BEFORE DELETION");
for(int i=0; i<n; i++)
{
System.out.println(a[i] + " ");
}
System.out.println("Enter the position where the element should be inserted");
int pos = s.nextInt();
for(int i=pos; i<n; i++)
{
a[i] = a[i+1];
}
--n;
System.out.println("ARRAY ELEMENTS AFTER DELETION");
for(int i=0;i<n;i++)
{
System.out.println(a[i] + " ");
}
}
}
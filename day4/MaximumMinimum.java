import java.util.*; 
class MaximumMinimum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array: ");
int n = sc.nextInt();
int a[] = new int[n];
for(int i=0; i<n; i++)
{
System.out.print("Please give value for index "+ i +" : ");
a[i] = sc.nextInt();
}
int max = a[0];
int min = a[0];
for (int i = 1; i < a.length; i++)
{
if (a[i] > max)
{
max = a[i];
}
else if (a[i] < min)
{
min = a[i];
}
}
System.out.println("Minimum array element is " + min);
System.out.println("Maximum array element is " + max);
}
}
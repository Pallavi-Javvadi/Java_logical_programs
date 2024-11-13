class ArrayUnique
{
public static void main(String args[])
{
int i,j;
int a[]={1,1,2,2,3,3,4,8,6,3};
System.out.println("The array is:");
for(i=0;i<a.length;i++)
 System.out.println(a[i]);
System.out.println("The unique elements are:");
for(i=0;i<a.length;i++)
{
for(j=0;j<i;j++)
if(a[i]==a[j])
break;
if(i==j)
 System.out.println(a[i]);
}
}
}
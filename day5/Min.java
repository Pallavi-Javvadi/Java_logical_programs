import java.util.Scanner;
public class Min
{
static final int N=256;
static char MinOccuringChar(String str1)
{
int ctr[]=new int[N];
int l = str1.length();
for(int i=0;i<1;i++)
ctr[str1.charAt(i)]++;
int min=-2;
char result = ' ';
for(int i=0;i<1;i++)
{
if(min < ctr[str1.charAt(i)])
{
min=ctr[str1.charAt(i)];
result=str1.charAt(i);
}
}
return result;
}
public static void main(String args[])
{
String str1="test string";
System.out.println("Min occurring character in the given string is:"+MinOccuringChar(str1));
}
}
import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter a alphabet:");
char n=s.next().charAt(0);

if(n=='a' || n=='e' || n=='i' ||  n=='o' || n=='u')
{
System.out.println("given alphabet is vowel");
}
else
{
System.out.println("given alphabet is consonant");
}
}
}

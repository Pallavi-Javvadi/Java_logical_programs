import java.util.Scanner;
public class CountAlpDigiSpl
{
private static Scanner sc;
public static void main(String args[])
{
String aldisp_str;
int i,alph,digi,spl;
alph=digi=spl=0;
char ch;
sc=new Scanner(System.in);
System.out.print("\n please enter alpha numeric special string=");
aldisp_str=sc.nextLine();
for(i=0;i<aldisp_str.length();i++)
{
ch=aldisp_str.charAt(i);
if(ch>='a' && ch<='z' || ch>='A' && ch>='Z')
{
alph++;
}
else if(ch>='0' && ch<='9')
{
digi++;
}
else
{
spl++;
}
}
System.out.println("\n number of alphabet characters = " +alph); 
System.out.println("number of digit characters = " +digi);
System.out.println("number of special characters = " +spl);
}
}

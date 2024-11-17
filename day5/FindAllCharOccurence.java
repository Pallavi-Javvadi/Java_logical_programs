import java.util.Scanner;
class FindAllCharOccurence
{
private static Scanner sc;
public static void main(String arge[])
{
String facStr;
char ch;
int i=0;
sc=new Scanner(System.in);
System.out.println("\n enter any String = ");
facStr=sc.nextLine();
System.out.println("\n enter any character to find = ");
ch=sc.next().charAt(0);
while(i<facStr.length())
{
if(facStr.charAt(i)==ch)
{
System.out.format("\n %c Found at position %d",ch,i+1);
}
i++;
}
}
}


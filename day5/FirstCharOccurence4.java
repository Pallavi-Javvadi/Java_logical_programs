import java.util.Scanner;
public class FirstCharOccurence4 
{
private static Scanner sc;
public static void main(String[] args)
 {
String firstCharStr;
char ch;
sc= new Scanner(System.in);
System.out.print("\nPlease Enter String to find First Occurrence =  ");
firstCharStr = sc.nextLine();
System.out.print("\nEnter the Character to Find =  ");
ch = sc.next().charAt(0);
StringBuilder sb = new StringBuilder(firstCharStr);
int x = sb.indexOf(String.valueOf(ch));
System.out.format("\nThe First Character Occurrence of %c at %d position", sb.charAt(x), x);
StringBuffer sbuff = new StringBuffer(firstCharStr);
int y = sb.indexOf(String.valueOf(ch));
System.out.format("\nThe First Character Occurrence of %c at %d position", sbuff.charAt(y), y);
}
}

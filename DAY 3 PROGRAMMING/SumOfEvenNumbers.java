import java.util.Scanner;
public class SumOfEvenNumbers {
private static Scanner sc;
public static void main(String[] args) 
{
int number, i, evenSum = 0;
sc = new Scanner(System.in);		
System.out.print(" Please Enter any Number : ");
number = sc.nextInt();			
for(i = 1; i <= number; i++)
{
if(i % 2 == 0)
{
evenSum = evenSum + i; 
}
System.out.println(" The Sum of Even Numbers upto " + number + "  =  " + evenSum);
}
}
}
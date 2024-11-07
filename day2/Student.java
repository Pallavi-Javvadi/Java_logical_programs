import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter student number:");
int sno=s.nextInt();
System.out.println("enter student name:");
String sname=s.next();
System.out.println("enter student marks in maths:");
int sm1=s.nextInt();
System.out.println("enter student marks in phy:");
int sm2=s.nextInt();
System.out.println("enter student che:");
int sm3=s.nextInt();

int total=sm1+sm2+sm3;

float avarage=total/3;

System.out.println("total marks of a student:"+total);

System.out.println("average marks for 3 subjects:"+avarage);
}
}

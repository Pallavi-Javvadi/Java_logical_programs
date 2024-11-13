import java.util.Scanner;
class Student
{
int sno;
String sname;
int m1,m2,m3;
Scanner s=new Scanner(System.in);
void read()
{
System.out.println("enter student number:");
sno=s.nextInt();
System.out.println("enter student name:");
sname=s.next();
System.out.println("enter student marks:");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
}
}
class B extends Student
{
int tot;
float avg;
void total()
{
tot=m1+m2+m3;
avg=tot/3;
}
}
class C extends B
{
void report()
{
System.out.println("the student number is:"+sno);
System.out.println("the student name is:"+sname);
System.out.println("the student total is:"+tot);
System.out.println("the student average is:"+avg);
}
}
class MultiLevel
{
public static void main(String args[])
{
C s=new C();
s.read();
s.total();
s.report();
}
}




import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

int pno;
String pname;
float pcost;
float pquantity;

System.out.println("enter product number:");
pno=s.nextInt();
System.out.println("enter product name:");
pname=s.next();
System.out.println("enter product cost for 1kg:");
pcost=s.nextFloat();
System.out.println("enter product quantityr:");
pquantity=s.nextFloat();

float bill=pcost*pquantity;

System.out.println("the product number is:"+pno);
System.out.println("the product name is:"+pname);
System.out.println("the product cost is:"+pcost);
System.out.println("the product quantity is:"+pquantity);
System.out.println("the product bill is:"+bill);
}
}

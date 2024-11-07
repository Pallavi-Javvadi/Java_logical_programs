import java.util.Scanner;
class Area
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
float pi=3.14f;

System.out.println("radius of the circle:");
int r=s.nextInt();

float area=pi*r*r;

System.out.println("area of the circle:"+area);
}
}
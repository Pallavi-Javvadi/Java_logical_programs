class StringConcate
{
public static void main(String args[])
{
String s1="hello";
System.out.println(s1.length());
String s2="mca";
System.out.println(s2.length());
System.out.println("Comparing" + s1 + " and " + s2 + " : ");
String s3=s1.concat(s2);
System.out.println(s3);
}
} 

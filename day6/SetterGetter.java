class Student
{
private int num=8009;
private String name="pallavi";

public void setNum(int num)
{
this.num=num;
}
public int getNum()
{
return num;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void printStudent()
{
System.out.println("number is :"+num);
System.out.println("name is :"+name);
}
}
class SetterGetter
{
public static void main(String []args)
{
Student s1=new Student();
s1.printStudent();
s1.setNum(4653);
System.out.println("number is:"+s1.getNum());
}
}
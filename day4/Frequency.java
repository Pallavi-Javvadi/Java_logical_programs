public class Frequency
{  
public static void main(String[] args)
{  
int [] a = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
int [] f = new int [a.length];  
int b= -1;  
for(int i = 0; i < a.length; i++){  
int count = 1;  
for(int j = i+1; j < a.length; j++)
{  
if(a[i] == a[j])
{  
count++; 
f[j] = b;  
}  
}  
if(f[i]!=b)  
f[i] = count;  
}  
System.out.println("array  Elements and Frequency");  
for(int i = 0; i < f.length; i++){  
if(f[i] !=b)  
System.out.println("element \t" + a[i] + "\t frequency is \t" + f[i]);  
}      
}
}  

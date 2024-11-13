public class Copy
{
public static void main(String[] args) 
{
int[] arr = {5, 4, 3, 2, 1};
int[] arr2 = new int[arr.length];
    
for(int i = 0; i<arr.length; i++)
arr2[i] = arr[i];
    
System.out.println("The original array is: ");
for (int i = 0; i < arr.length; i++)
System.out.print(arr[i] + " ");
  
System.out.println("\n the copied array is");
for (int i = 0; i < arr2.length; i++)
System.out.print(arr2[i] + " ");
}
}
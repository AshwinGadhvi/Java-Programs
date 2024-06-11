import java.util.*;

public class practice2 {
        
    public static void main(String[] args) {
        int a[],size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size pf Array : ");
        size = sc.nextInt();
        a = new int[size];
      	System.out.println("Enter The ELement of Array : ");
   		for(int i=0;i<a.length;i++)
   		{
   			a[i] = sc.nextInt();
   		}
   		System.out.println("The Element Of Array is : ");
   		for(int i=0;i<a.length;i++)
   		{
   			System.out.println(a[i]);
   		}
   		int max=a[0];
   		for(int i=0;i<a.length;i++)
   		{
   			if(max<a[i])
   			{
   				max=a[i];
   			}
   		}
   		 
   		System.out.println("Maximum is : "+max);
    }
}

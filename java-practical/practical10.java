import java.util.*;
public class practical10 {
    public practical10() {
    }
    
    public static void main(String[] args) {
		       	int size;
       	Scanner sc = new Scanner(System.in);
       	System.out.print("Enter Number here : ");
       	size=sc.nextInt();
       	System.out.println("Enter Number here : "+size);
       	   	for(int i=size;i>0;i--)
       	{
       		for(int j=1;j<=i;j++)
       		{
       			System.out.print(" "+i);
       		}
       		System.out.println("");
       	}
       	for(int i=1;i<=size;i++)
       	{
       		for(int j=1;j<=i;j++)
       		{
       			System.out.print(i);
       		}
       		System.out.println(" ");
       	}
    
    }
}

import java.util.*;
public class practical3 {
        
    /**
     * Creates a new instance of <code>practical3</code>.
     */
    public practical3() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	int a[],size;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter The Size Of Array : ");
    	size = sc.nextInt();
    	a = new int[size];
    	System.out.println("Enter The Element Below : ");
    	for(int i=0;i<size;i++)
    	{
    		System.out.print("Enter Element a["+i+"] : ");
    		a[i]=sc.nextInt();
    	}
    	System.out.println("Entered Elements are : ");
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.println(a[i]);
    	}
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]>a[j])
    			{
    				int temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
    	System.out.println("Second maximum is : "+a[size-2]);
    	}
    
}

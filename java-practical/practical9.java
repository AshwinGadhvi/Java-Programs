import java.util.*;
public class practical9 {
        
    /**
     * Creates a new instance of <code>practical9</code>.
     */
    public practical9() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	int size;
       	Scanner sc = new Scanner(System.in);
       	System.out.print("Enter Number here : ");
       	size=sc.nextInt();
       	System.out.println("Enter Number here : "+size);
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i==0 || i==size-1 || j==0 || j==1)
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}


      }
        
    
}
/*
*****
**
**
**
**
*****

  1 
 2 2
3 3 3
 4 4
  5

3 3 3
 2 2
  1
  1
 2 2
3 3 3
*/
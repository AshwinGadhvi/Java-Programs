import java.util.*;

public class ParentClass {
        
    /*
     * Creates a new instance of <code>ParentClass</code>.
     */
     int a;
     public ParentClass(int a1)
     {
     	a=a1;
     }
     public void display()
     {
     	System.out.println(a);
     }
    public ParentClass() {
    }
}
class ChildClass extends ParentClass{
	public ChildClass(int b1)
	{
		super.a(b1);
	}
	public static void main(String args[])
	{
		
		ChildClass c = new ChildClass(20);
		c.display();
	}
}

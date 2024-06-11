import java.util.*;


public class practical8 {
    public int roll;
    public String name;
    public practical8(int r1,String n1) {
    	roll=r1;
    	name=n1;
    }
    public void display()
    {
    	System.out.println("Roll number is : "+roll);
    	System.out.println("Name is : "+name);
    }
    public static void main(String[] args) {
		practical8 ob = new practical8(1,"ashwin");
		practical8 ob1 = new practical8(2,"dhruv");
		ob.display();
		ob1.display();
		ArrayList a = new ArrayList();
		a.add(ob);
		a.add(ob1);
		for(Object x:a)
		{
			System.out.println(m);
		}
		
		
    }
}

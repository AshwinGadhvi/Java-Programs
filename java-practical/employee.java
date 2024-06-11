import java.util.*;
public class employee {
    int salary;
    String name="";
    
    public employee(int n1,String s1) {
    	salary=n1;
    	name=s1;
    }
    public void display()
    {
    	System.out.println("Salary is : "+salary);
    	System.out.println("Name is : "+name);
    }
    public static void main(String[] args) {
        employee e1 = new employee(10000,"Ashwin");
        employee e2 = new employee(5000,"Gadhvi");
        employee e3 = new employee(2000,"sneh");
        employee e4 = new employee(1000,"kandoi");
        e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		List<employee> emp = Arrays.asList(e1,e2,e3,e4);
		System.out.println(emp);
    }
}

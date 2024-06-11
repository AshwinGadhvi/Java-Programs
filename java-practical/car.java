import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Enumeration;

public class car{

	String nameOfCar,color;
	
    public car(String c1,String c2) {
    	this.nameOfCar=c1;
    	color=c2;
    }
    public String getName()
    {
    	return nameOfCar;
    }
    public String getColor()
    {
    	return color;
    }
    public static void main(String[] args) {
        car op1 = new car("Tata","red");
        car op2 = new car("suzuki","black");
        car op3 = new car("audi","white");
        car op4 = new car("farari","pink");
        car op5 = new car("lambo","green");
        Vector v = new Vector();
        v.add(op1);
        v.add(op2);
        v.add(op3);
        v.add(op4);
        v.add(op5);
        ArrayList a = new ArrayList();
        a.add(op1);
        a.add(op2);
        a.add(op3);
        a.add(op4);
        a.add(op5);
        LinkedList l = new LinkedList();
        l.add(op1);
        l.add(op2);
        l.add(op3);
        l.add(op4);
        l.add(op5);
        Enumeration e = v.elements();
        
        while(e.hasMoreElements())
        {
        	car s = (car)e.nextElement();
        	System.out.println(s.getName()+" "+s.getColor());
        }
        Iterator op = a.iterator();
        System.out.println("------After Deletion :----- ");
         while(op.hasNext())
        {
        	if(op.next().equals("red"))
        	{
        		op.remove();
        		break;
        	}
        	
	
        }
        //use a foreach
        ArrayList ok = (ArrayList) op;
        for (Object ashwin:ok) {
            System.out.println((String)ashwin);
        }
       
        
    }
}

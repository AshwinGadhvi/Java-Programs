import java.util.*;

public class EnumerationExample {
        
    /**
     * Creates a new instance of <code>EnumerationExample</code>.
     */
    public EnumerationExample() {
    }
    
    /**
     * hasNext()
     *next()
     *nextIndex()
     *hasPrivious()
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(10);
        v.add(20);
        v.add(15);
        v.add(12);
        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
        	System.out.println(e.nextElement());
        }
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        Iterator e = a.iterator();
        while(e.hasNext())
        {
        	if(e.next().equals(10))
        	{
        		
        	}
        }
        	
    }
}

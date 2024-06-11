import java.util.*;
public class HashMapExample {
        
    /**
     * Creates a new instance of <code>HashMapExample</code>.
     */
    public HashMapExample() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	HashMap h = new HashMap();
       	h.put(1,"Java");
       	h.put(21,"python");
       	h.put(10,"C");
       	h.put(16,"php");
       	h.put(8,"c++");
       	System.out.println(h);
       	h.put(5,"NET");
       	System.out.println(h);
       	//hashmap order learning
       	Set s = h.entrySet();
       	Iterator i = s.iterator();
       	while(i.hasNext())
       	{
       		Map.Entry m =(Map.Entry)i.next();
       		System.out.println(m.getKey()+" : "+m.getValue());
       	}
       	
      /* 	for(Object x:h.keySet())
       	{
       		System.out.println(x);
       	}
       		for(Object x:h.values())
       	{
       		System.out.println(x);
       	}*/
      }
}

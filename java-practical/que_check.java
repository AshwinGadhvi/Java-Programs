import java.util.*;


class a{
	public int i;
	private int j;
}
class b extends a{
	
	void display()
	{
		super.j=super.i+1;
		System.out.println(super.j+" "+super.i);
	}
}
public class que_check extends b{
	public static void main(String args[])
	{
		b obj = new b();
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}


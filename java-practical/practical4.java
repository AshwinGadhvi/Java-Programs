import java.util.*;

public class practical4 {
     public static void main(String[] args) {
    String a[]={"Ashwin","Sneh","Het","Hem","asdfghgfdsdfghjhgfds"};
    int max=a[0].length();
    String s="";
    for(int i=0;i<a.length;i++)
    {
    	
    	if(max<a[i].length())
    	{
    		max=a[i].length();
    		s = a[i];
    		
    	}
    }
   	System.out.println("The Longest String In Array : "+s);	
    	
  }
}

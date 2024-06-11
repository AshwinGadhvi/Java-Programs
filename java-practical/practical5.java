import java.util.*;

public class practical5 {
        
    public practical5() {
    }
    public static void main(String[] args) {
		int number,l_digit,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		number = sc.nextInt();
		int temp=number;
		while(number>0)
		{
			l_digit=number%10;
			rev=(rev*10)+l_digit;
			number=number/10;
		}
		if(temp==rev)
		{
			System.out.println("The Number IS pelindrome");
		}
		else
		{
			System.out.println("The Number Is Not Pelindrome");
			
		}
		
    }
}

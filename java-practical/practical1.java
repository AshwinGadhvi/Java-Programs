//write a java program prime number,pelindrome,calculator,armstrong,max from array,secong max from,fing longest string from array
import java.util.*;

public class practice1 {
        
    public practice1() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        number1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        number2 = sc.nextInt();
        int choice;
        System.out.println("1.For Addition : ");
        System.out.println("2.For Substraction : ");
        System.out.println("3.For Multiplication : ");
        System.out.println("4.For Dvision : ");
        System.out.print("Enter Your Choice : ");
        
        choice = sc.nextInt();
        
        
        switch(choice)
        {
        	case 1:
        		float ans1=number1+number2;
        		System.out.println("Addition is : "+ans1);
        		break;
        	case 2:
        		float ans2=number1-number2;
        		System.out.println("substraction is : "+ans2);
        		break;
        	case 3:
        		float ans3=number1*number2;
        		System.out.println("multiplication is : "+ans3);
        		break;
        	case 4:
        		float ans4=number1/number2;
        		System.out.println("substractin is : "+ans4);
        		break;
        	default:
        		System.out.println("Enter Proper Value");
        		break;
        }
    }
}

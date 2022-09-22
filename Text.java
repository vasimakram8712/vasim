package Collection3;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int num1=0;
	try {	int num2=num/num1;
	   System.out.println(num2);  
	}
	    catch(ArithmeticException e) {
    e.printStackTrace();
    System.out.println("msg");
	    }	
System.out.println("invalid data");
	}
}
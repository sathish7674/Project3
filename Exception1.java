package Exceotion;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int i= 100/0;
}catch(ArithmeticException ae)
{
	System.out.println(ae);
	
}
System.out.println("rest of the code ");
}
}

import java.util.*;
class Total{
	public static void main(final String[] args) {
		System.out.println("Enter the quntity:");
		final Scanner sc = new Scanner(System.in);
		final float f = sc.nextFloat();
		System.out.println("Enter the amount:");
		final float a = sc.nextFloat();
		final float total = a + f;
	System.out.println("Toatal is:"+total);
	
	}
}
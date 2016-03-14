import java.util.Scanner;

public class HwTest {
	public static void main(String []args){
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("insert one number A:");
		num1 = scanner.nextDouble();
		System.out.println("insert another number B:");
		num2 = scanner.nextDouble();
		
		double A = num1 + num2;
		double B = num1 - num2;
		double C = num1 * num2;
		System.out.println("A+B=" + A);
		System.out.println("A-B=" + B);
		System.out.println("A*B=" + C);
		
		double D = num1 / num2;
		if(num2 == 0){
			System.out.println("A/B is invalid");
		}
		
		else{
			System.out.println("A/B=" + D);
		}
		
		
	}

}

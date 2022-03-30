import java.util.Scanner;
public class FactorialRecersion{
	static int number=0;
	static int factorial(int num){
		if(num==1){
			return 1;
		}
		return num*factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		System.out.println("please enter");
		number=sc.nextInt();

		System.out.println(factorial(number));
	}
}
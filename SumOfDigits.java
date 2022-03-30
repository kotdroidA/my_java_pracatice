import java.util.*;

class SumOfDigits{

	int number,digit,sum=0;

	public static void main(String[] args) {

		SumOfDigits object=new SumOfDigits();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number .");
		object.number=sc.nextInt();
		object.sumOfNumbers(object.number);
		
	}

	void sumOfNumbers(int num){

		while(number>0){
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("sum Of digits "+sum);
	}
}
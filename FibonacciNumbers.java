import java.util.*;
class FibonacciNumbers{



	static int maxNum = 0; 
	static  void fibonacciNumbers(long num1,long num2){

		if(num1==0){
			System.out.println(num1+" ");
		}
		// System.out.println(num1+" ");
		System.out.println(num2+" ");
		if(maxNum==0){
			return ;
		}

		maxNum--;	

		 fibonacciNumbers(num2,num1+num2);


	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Number");
		maxNum=sc.nextInt();
		int n1=0;
		int n2=1;
		fibonacciNumbers(n1,n2);
		


	}
}
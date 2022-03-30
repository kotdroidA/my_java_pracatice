import java.util.*;
class Calculator{
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("please enter opration number.\n 1.sum \n 2.subtraction \n 3.multiply \n 4.division \n 5.sin \n 6.cos \n 7.tan");
	int oprationNumber=sc.nextInt();
	double result=0;
	if(oprationNumber==1||oprationNumber==2||oprationNumber==3||oprationNumber==4){
		System.out.println("please enter any two number.");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		switch(oprationNumber){
			case 1:
			result=num1+num2;
			break;
			case 2:
			result=num1-num2;
			break;
			case 3:
			result=num1*num2;
			break;
			case 4:
			result=num1/num2;
			break;
		}
	}
	else if(oprationNumber==5||oprationNumber==6||oprationNumber==7){
		System.out.println("please enter angle.");
		double angle = sc.nextDouble();
	
		switch(oprationNumber){
			case 5:
			 result = Math.sin(Math.toDegrees(angle));
			break;
			case 6:
			 result = Math.cos(angle);
			break;
			case 7:
			 result = Math.tan(angle);
			break;


		}

	}
	else{
		System.out.println("please select vaild opration.");
	}
	System.out.println(result);

	}
}
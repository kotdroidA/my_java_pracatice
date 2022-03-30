import java.util.*;
class SetOfNumbersAverage{
	static double setNumbersOfAverageSum(int ...arr){
 	double sum=0.0;

 	for(int i=0;i<arr.length;i++){
 		sum=sum+arr[i];
 	}
 	double average=(sum/arr.length);
 	return average;
   }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers would you like to enter");
		int n = sc.nextInt();
		int[] set= new int[n];
		for(int i=0;i<set.length;i++){
			set[i]=sc.nextInt();
		}
		System.out.println(setNumbersOfAverageSum(set));

	}
}
import java.util.*;
class Pattern{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int num=sc.nextInt();
		for(int i=num;i>=0;i--){
			for(int j=num;j>num-i+1;j--){
				System.out.print("* ");
			}
			System.out.println("");
		}

		int row=3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i+1;j++){
				System.out.print("* ");
			}
			System.out.println("");

		}
		
	}
}
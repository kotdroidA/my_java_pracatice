import java.util.*;
class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter");
		int countC1=0,countC2=0,countN1=0,countN2=0;
		String user = sc.nextLine();
		for (int i=0;i<user.length();i++) {
			char c=user.charAt(i);

			if(c=='('){
				countN1++;
			}
			else if(c==')'){
				countN2++;
			}
			else if(c=='{'){
				countC1++;
			}
			else if(c=='}'){
				countC2++;
			}
			
		}
		if(countC1==countC2&&countN1==countN2){

			System.out.println("yes,it's true bro.");
		}
		else{

			System.out.println("no,it's false .");
		}
	}
}
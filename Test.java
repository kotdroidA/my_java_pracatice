import java.util.*;
class Test{

	
	public static void main(String[] args){

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter text.");
		String text=sc.nextLine();
		if(text.length()%2==0){
			int num=text.length()/2;
			String str=text.substring(num-1,num+1);
			System.out.println(str);
		}
		else{
			int num=(text.length()-1)/2;
			char ch=text.charAt(num);
			System.out.println(ch);
		}
		
	}
	
}
import java.util.*;
class RemoveFunction{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string.");
		String str=sc.nextLine();
		System.out.println("please enter reaplce Character.");
		String s1 =sc.nextLine();
		String s2 =sc.nextLine();
		String replaceAll=str.replaceAll(s1,s2);
		System.out.println(replaceAll);
		
	}
}
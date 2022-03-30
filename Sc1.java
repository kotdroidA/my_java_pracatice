import java.util.*;
class Sc1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name , roll number & field interest.");
		String name =sc.nextLine();
		int rollNum =sc.nextInt();
		String interest =sc.nextLine();
		System.out.println("Hye, My name is "+name+"and my roll number is "+rollNum+".My field interest of "+interest+".");
	}
}
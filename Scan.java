import java.util.*;
class Scan{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name.");
		String name = sc.nextLine();
		System.out.println("please enter your rollNumber.");
		int rollNum = sc.nextInt();
		System.out.println("please enter your interest field.");
		String interest =sc.nextLine();
		System.out.println("Hye, My name is "+name+"& my rollNumber "+rollNum+".My field of interest are "+interest+".");


	}
}
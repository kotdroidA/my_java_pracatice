 import java.util.*;
 public class Student{

	int mathsMarks,hindiMarks,englishMarks;

	String name;
	void printInfo(){
		double average = (mathsMarks+hindiMarks+englishMarks)/3;
		System.out.println(name+" avrage marks is :"+average);
	}




	public static void main(String[] args) {

		Student[] studentArray = new Student[8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++){

			Student st = new Student();
			System.out.println("please enter name");
			st.name=sc.nextLine();
			System.out.println("please enter marks");
			st.mathsMarks=sc.nextInt();
			st.hindiMarks=sc.nextInt();
			st.englishMarks=sc.nextInt();
			sc.nextLine();

			studentArray[i]=st;

		}

		for(int i=0;i<8;i++){
			studentArray[i].printInfo();
		}


	}    

	// Emp.Name   Year Of Joining         Address
	// Anchal     2022				      Chandigarh
	// Julie      2022		              Chandigarh
	// Pushkar 	  2018					  Banglore(Work From Home Chandigarh)
}
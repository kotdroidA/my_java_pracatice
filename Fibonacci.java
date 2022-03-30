class Fibonacci{
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num=0;
		System.out.println(num1);
		System.out.println(num2);

		for(int i=0;i<5;i++){
		
			num=num1+num2;
			System.out.println(num);
		  	
		  	num1=num2;
		  	num2=num;

		}
	}

}
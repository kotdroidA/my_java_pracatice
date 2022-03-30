class Practic{


	public static void main(String[] args) {
	

        int n, first, second, third, reverse;
   	 /*finding the digits of the entered number n*/
   	 n = 100;
    	first = n/100;     //first digit
     n =n%100;
	
     second = n/10;     //second digit
     third = n%10;      //third digit
	
     /*reverse number */
     reverse = third*100 + second*10 + first;
     System.out.println("reverse number : "+reverse);



     int a=6;
     float b=5.6454f;
     System.out.printf("The value of a is %d and value of b is %2.2f",a,b);

	}


}
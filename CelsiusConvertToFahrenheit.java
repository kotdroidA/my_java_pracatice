import java.util.*;
class CelsiusConvertToFahrenheit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//CelsiusConvertToFahrenheit

		System.out.println("please enter fahrenheit");
		int fahrenheit=sc.nextInt();
		double celsius=(((fahrenheit-32)*5)/9.0);
		System.out.println("CelsiusConvertToFahrenheit ="+celsius);

		//FahrenheitConvertToCelsius
		
		System.out.println("please enter celsius");
		int celsius1=sc.nextInt();
		double fahrenheit1=((celsius1*1.8)+32);
		System.out.println("FahrenheitConvertToCelsius ="+fahrenheit1);
	}
}
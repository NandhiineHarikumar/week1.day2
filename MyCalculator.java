package week1.day2;

public class MyCalculator
{
	public static void main(String[] args)
	{
		Calculator calc=new Calculator();
		System.out.println(calc.addNumbers(5, 9, 4));
		System.out.println(calc.subTwoNumbers(9, 2));
		System.out.println(calc.multiplyTwonumbers(7, 5));
		System.out.println(calc.divideTwoNumbers(150, 5));
	}
}

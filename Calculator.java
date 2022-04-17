package week1.day2;

	  /*(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
		(b) sub(int num1, int num2), it should return subtraction of of num1-num2
		(c) mul(double num1, double num2), it should return product of num1 * num2
		(d) divide(float num1, float num2), it should return division of num1 / num2*/
public class Calculator 
{
	public int addNumbers(int num1,int num2,int num3)
	{
		int result=num1+num2+num3;
		return result;
	}
	public int subTwoNumbers(int num1,int num2)
	{
		int result=num1-num2;
		return result;
	}
	public int multiplyTwonumbers(int num1,int num2)
	{
		int result=num1*num2;
		return result;
	}
	public int divideTwoNumbers(int num1,int num2)
	{
		int result=num1/num2;
		return result;
	}
}

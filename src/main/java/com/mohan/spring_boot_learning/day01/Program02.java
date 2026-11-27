package com.mohan.spring_boot_learning.day01;

class Program10{
	public float m1() {
		return 10.5f;
	}
}
class TaxService{
	public float calculateTax(){
		return 10.5f;
	}
}
class Program20 extends Program10{
	@Override
	public float m1() {
			float data = (int)super.m1();
			return data * data;
	}
}
class User1 extends Program20{
	public float result() {
		float value = super.m1();
		return value;
	}
}
public class Program02 {
	public static void main(String[] args) {
		User1 user = new User1();
		float result = user.result();
		System.out.println(result);
	}

}

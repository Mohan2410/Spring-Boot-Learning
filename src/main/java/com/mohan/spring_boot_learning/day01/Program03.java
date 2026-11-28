package com.mohan.spring_boot_learning.day01;

//developer-1
class BankService{
	public double calculateIntrest(){
		return 5.0;
	}
}
//developer-2
class PremiumBankService {//extends BankService{
	BankService service;
	public double calculateIntrest() {
		return service.calculateIntrest() + 2.0;
	}
}
public class Program03 {
	public static void main(String[] args) {
		
	}
}

//covariant return type
/*
class College{
	
}
class Student extends College{
	
}
class University{
	public College takeAdms() {
		return new College();
	}
}
class SPPU extends University{
	@Override
	public Student takeAdms() {
		return new Student 	();
	}
}
public class Program03{
	public static void main(String[] args) {
		SPPU u = new SPPU();
		u.takeAdms();
	}
}

*/
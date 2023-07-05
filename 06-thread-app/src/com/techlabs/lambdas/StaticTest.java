package com.techlabs.lambdas;

public class StaticTest {
	static void print()
	{
		System.out.println("Inside static Class");
	}


	public static void main(String[] args) {
		ITester tester1=StaticTest::print;
		tester1.test();
		
		NonStaticTest non=new NonStaticTest();
		ITester tester2=non::print;
		tester2.test();
		
		ITester tester3=NonStaticTest::new;
		tester3.test();
		
		
		
		
	}

}

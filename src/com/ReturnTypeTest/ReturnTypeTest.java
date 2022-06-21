package com.ReturnTypeTest;

public class ReturnTypeTest {

	// Father
	public static void main(String[] args) {
		son1();
		son2();
		System.out.println(son1() + son2());
		// Add Perform Try
	}

	public static int son1() {
		int a = 10; // 1
		int b = 20; // 2
		int c = a + b; // 3
		System.out.println(c); // 4
		return c;
	}

	public static int son2() { // Entry Point
		int a = 20;
		int b = 20;
		int c = a + b;

		System.out.println(c);
		// return c;
		// return a;
		return c;
	} // Exit Point

}

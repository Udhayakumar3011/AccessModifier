package com.objectTest;

public class SampleObjectTest {

	public static void main(String[] args) {

		add();
		// sub();
		SampleObjectTest a = new SampleObjectTest();
		a.sub(); // non static method
		a.add(); // static method
		new SampleObjectTest();
		System.out.println(a);
	}

	public static void add() {
		System.out.println("Add");
	}

	public void sub() {
		System.out.println("Sub");
	}

}

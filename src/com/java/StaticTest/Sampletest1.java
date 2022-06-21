package com.java.StaticTest;

public class Sampletest1 {

	public static void main(String[] args) {

		add();
		sub();
		//exec();
		
	}

	public static void add() {
		System.out.println("Add");
	}

	public static void sub() {
		System.out.println("sub");
	}

	public void exec() {
		System.out.println("Execute");
		sub(); // non static
		add(); // static
	}

}

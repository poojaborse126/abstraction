package com.test;

public class AbstractSubclassEx4 extends AbstractEx4 {
	String name;

	void getVal(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Hello " + name);
	}

	public static void main(String args[]) {
		AbstractSubclassEx4 obj = new AbstractSubclassEx4();
		obj.getVal("SampleCodez");
		obj.display();
	}
}

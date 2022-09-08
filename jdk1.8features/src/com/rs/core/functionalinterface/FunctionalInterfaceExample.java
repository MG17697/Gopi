package com.rs.core.functionalinterface;

public class FunctionalInterfaceExample implements Sayable {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample file = new FunctionalInterfaceExample();
		file.say("Hello there");
		file.doIt();

	}

}

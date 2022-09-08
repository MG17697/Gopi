package com.rs.core.functionalinterface;

public interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}

}

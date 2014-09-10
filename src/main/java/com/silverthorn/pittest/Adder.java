package com.silverthorn.pittest;

import org.springframework.stereotype.Component;

@Component
public class Adder {

	private static Adder instance;
	
	public Adder() {
		if (null != instance)
			throw new IllegalStateException("Can only instantiate one instance of Adder.");
		instance = this;
	}
	
	public int add(int first, int second) {
		return first + second;
	}
}

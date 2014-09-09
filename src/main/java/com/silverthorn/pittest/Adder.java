package com.silverthorn.pittest;

import org.springframework.stereotype.Component;

@Component
public class Adder {

	public Adder() {
		System.out.println("CONSTRUCTING ADDER!!!!");
	}
	
	public int add(int first, int second) {
		return first + second;
	}
}

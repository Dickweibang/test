package com01;

public class GreetDaoImpl implements GreetDao {
	private Greeting greet;

	public GreetDaoImpl() {

	}

	public GreetDaoImpl(Greeting greet) {
		this.greet = greet;
	}

	public void sayGreeting() {
		greet.sayGreeting();
	}

}

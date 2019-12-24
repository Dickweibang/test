package com01;

public class GreetServiceImpl implements GreetService {
	private GreetDao greet;

	public GreetServiceImpl() {

	}

	public GreetServiceImpl(GreetDao greet) {
		this.greet = greet;
	}


	public GreetDao getGreet() {
		return greet;
	}

	public void setGreet(GreetDao greet) {
		this.greet = greet;
	}

	@Override
	public void sayGreeting() {
		// TODO Auto-generated method stub
		greet.sayGreeting();
	}

}

package com01;

public class Greeting {
	private String person = "Nobody";
	private String words = "nothing";

	public Greeting() {

	}

	public Greeting(String person, String words) {
		this.person = person;
		this.words = words;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public void sayGreeting() {
		System.out.println(person + "说：" + words);
	}
}

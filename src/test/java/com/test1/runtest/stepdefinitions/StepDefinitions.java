package com.test1.runtest.stepdefinitions;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	String text = "", temp = "";

	@When("Write text I want")
	public void inputText() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		this.text = scan.nextLine();
	}

	@Then("Validate the outcomes is Palindrome text")
	public void validateText() {
		this.text = this.text.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for (int i = text.length() - 1; i >= 0; i--) {
			this.temp = this.temp + text.charAt(i);
		}

		if (text.equals(temp)) {
			System.out.println("This text is Palindrome");
		} else {
			System.out.println("This text isn't Palindrome");
		}
	}

}

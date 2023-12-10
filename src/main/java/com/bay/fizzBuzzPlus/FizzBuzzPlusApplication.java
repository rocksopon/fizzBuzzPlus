package com.bay.fizzBuzzPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzPlusApplication {

	public static void main(String[] args) {

		SpringApplication.run(FizzBuzzPlusApplication.class, args);

	}

	public String mainFizzBuzz(int inputNumber) {

		var returnString = fizzBuzzCheck(inputNumber);
		if (returnString.equalsIgnoreCase("FizzBuzz")) {
			return returnString;
		}
		returnString = fizzBuzzPlusCheck(inputNumber);
		return returnString;
	}

	public String fizzBuzzCheck(int inputNumber) {
		String returnString = "";

		if (inputNumber % 3 == 0) {
			returnString = "Fizz";
		}

		if (inputNumber % 5 == 0) {
			returnString = "Buzz";
		}

		if (inputNumber % 15 == 0) {
			returnString = "FizzBuzz";
		}

		return returnString;
	}

	public String fizzBuzzPlusCheck(int inputNumber) {
		String returnString = "";

		boolean containThree = false;
		boolean containFive = false;

		var inputString = String.valueOf(inputNumber);
		for (var eachChar : inputString.toCharArray()) {
			if (eachChar == '3') {
				containThree = true;
			}
			if (eachChar == '5') {
				containFive = true;
			}
		}

		if (containThree) {
			returnString = "Fizz";
		}
		if (containFive) {
			returnString = "Buzz";
		}

		return returnString;
	}

}

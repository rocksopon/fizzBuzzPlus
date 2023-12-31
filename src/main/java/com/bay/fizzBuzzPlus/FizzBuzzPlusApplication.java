package com.bay.fizzBuzzPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzPlusApplication {

	public static void main(String[] args) {

		SpringApplication.run(FizzBuzzPlusApplication.class, args);

		for (int i = 1; i < 101; i++)
		{
			String answer = mainFizzBuzz(i);
			System.out.println(answer);
		}
	}

	public static String mainFizzBuzz(int inputNumber) {
		var returnString = String.valueOf(inputNumber);
		returnString = fizzBuzzCheck(inputNumber);
		if (returnString.equalsIgnoreCase("FizzBuzz")) {
			return returnString;
		}
		returnString = fizzBuzzPlusCheck(inputNumber);
		return returnString;
	}

	public static String fizzBuzzCheck(int inputNumber) {

		String returnString = String.valueOf(inputNumber);

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

	public static String fizzBuzzPlusCheck(int inputNumber) {
		String returnString = String.valueOf(inputNumber);

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
		if (containThree && containFive) {
			returnString = "FizzBuzz";
		}

		return returnString;
	}

}

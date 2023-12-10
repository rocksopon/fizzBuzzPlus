package com.bay.fizzBuzzPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzPlusApplication {

	public static void main(String[] args) {

		SpringApplication.run(FizzBuzzPlusApplication.class, args);

	}

	public String mainFizzBuzz(int inputNumber) {

		return fizzBuzzCheck(inputNumber);
	}

	public String fizzBuzzCheck(int inputNumber) {
		String returnString = "";

		if (inputNumber % 3 == 0) {
			returnString = "Fizz";
		}

		if (inputNumber % 5 == 0) {
			returnString = "Buzz";
		}

		return returnString;
	}

}

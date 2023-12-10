package com.bay.fizzBuzzPlus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzPlusApplicationTests {

	@Autowired
	private FizzBuzzPlusApplication fizzBuzzPlusApplication;

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> FizzBuzzPlusApplication.main(new String[]{}));
	}

	@Test
	void dividedBy3ExpectedFizz() {
		assertEquals("Fizz", fizzBuzzPlusApplication.mainFizzBuzz(3));
	}

	@Test
	void dividedBy5ExpectedBuzz() {
		assertEquals("Buzz", fizzBuzzPlusApplication.mainFizzBuzz(5));
	}

	@Test
	void dividedBy3And5ExpectedFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzzPlusApplication.mainFizzBuzz(15));
	}

	@Test
	void contain3ExpectedFizz() {
		assertEquals("Fizz", fizzBuzzPlusApplication.mainFizzBuzz(32));
	}

	@Test
	void contain5ExpectedBuzz() {
		assertEquals("Buzz", fizzBuzzPlusApplication.mainFizzBuzz(52));
	}

}

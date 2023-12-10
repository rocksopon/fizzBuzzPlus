package com.bay.fizzBuzzPlus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class FizzBuzzPlusApplicationTests {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> FizzBuzzPlusApplication.main(new String[]{}));
	}

}

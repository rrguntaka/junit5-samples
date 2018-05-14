package demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	public void before() {
		this.fizzBuzz = new FizzBuzz();
	}

	@DisplayName("Play FizzBuzz with number = 1")
	@Tag("string")
	@Test
	public void testNumber() {
		String fizzBuzz = this.fizzBuzz.play(1);
		Assertions.assertEquals(fizzBuzz, "1");
	}
	
	@DisplayName("Play FizzBuzz with number = 3")
	@Tag("non-string")
	@Test
	public void testFizz() {
		String fizzBuzz = this.fizzBuzz.play(3);
		Assertions.assertEquals(fizzBuzz, "Fizz");
	}
	
	@DisplayName("Play FizzBuzz with number = 5")
	@Tag("non-string")
	@Test
	public void testBuzz() {
		String fizzBuzz = this.fizzBuzz.play(5);
		Assertions.assertEquals(fizzBuzz, "Buzz");
	}
	
	@DisplayName("Play FizzBuzz with number = 0")
	@Tag("exception")
	@Test
	public void testZero() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> this.fizzBuzz.play(0));
	}
	
	@DisplayName("Play FizzBuzz with number = 15")
	@Tag("non-string")
	@Test
	public void testThirty() {
		String fizzBuzz = this.fizzBuzz.play(15);
		Assertions.assertEquals(fizzBuzz, "FizzBuzz");
	}

}

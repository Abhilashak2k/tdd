package co.interleap.courses.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VowelCounterTest {

	@Test 
    public void shouldCountZeroWithAnEmptyString(){
        assertEquals(0, new VowelCounter().countVowels(""));
    }
	
	@Test
	public void shouldCountOneWithSingleVowel() {
		assertEquals(1, new VowelCounter().countVowels("a"));
	}
	
	@Test
	public void shouldCountSingleVowel() {
		assertEquals(1, new VowelCounter().countVowels("trying"));
	}
	
	@Test
	public void shouldCountZeroWithSingleConsonant() {
		assertEquals(0, new VowelCounter().countVowels("x"));
	}
	
	@Test
	public void shouldCountZeroWithNoVowel() {
		assertEquals(0, new VowelCounter().countVowels("sky"));
	}
	
	@Test
	public void capitalShouldCountOneWithSingleVowel() {
		assertEquals(1, new VowelCounter().countVowels("E"));
	}
	
	@Test
	public void capitalShouldCountSingleVowel() {
		assertEquals(1, new VowelCounter().countVowels("tRYIng"));
	}
	
	@Test
	public void capitalShouldCountZeroWithSingleConsonant() {
		assertEquals(0, new VowelCounter().countVowels("Z"));
	}
	
	@Test
	public void capitalShouldCountZeroWithNoVowel() {
		assertEquals(0, new VowelCounter().countVowels("SKY"));
	}
}
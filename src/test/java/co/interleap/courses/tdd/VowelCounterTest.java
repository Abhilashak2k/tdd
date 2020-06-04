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
}
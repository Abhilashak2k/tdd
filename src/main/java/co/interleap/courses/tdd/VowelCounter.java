package co.interleap.courses.tdd;

public class VowelCounter {
	
	private int vowelCount=0;
	
	public int countVowels(String st) {
		
		if(st.length()==0) {
			return 0;
		}
		
		else {
			for(char i : st.toCharArray()) {
				
				if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ) {
					vowelCount++;
				}
				
			}
		}
		
		return vowelCount;
	}
}

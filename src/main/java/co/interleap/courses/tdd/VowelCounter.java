package co.interleap.courses.tdd;

public class VowelCounter {
	
	private int vowelCount=0;
	private char[] charList = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	
	public int countVowels(String st) {
		
		if(st.length()==0) {
			return 0;
		}
		
		else {
			for(char i : st.toCharArray()) {
				
				for(char j : charList) {
					if(i==j) {
						vowelCount++;
						break;
					}
				}
				
			}
		}
		
		return vowelCount;
	}
}

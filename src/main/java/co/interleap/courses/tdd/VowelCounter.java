package co.interleap.courses.tdd;

public class VowelCounter {
	
	private int vowelCount=0;
	private String charList = "aeiouAEIOU";
	
	private boolean isVowel(CharSequence i) {

		
		if(charList.contains(i)) {
			return true;
		}
		return false;
	}
	
	public int countVowels(String st) {
		
		if(st.length()==0) {
			return 0;
		}
		
		for(int i=0;i<st.length();i++) {
			
			String j = st.substring(i, i+1);
						
			if(isVowel(j)) {
				vowelCount++;
			}
				
			
		}
		
		return vowelCount;
	}

	
}

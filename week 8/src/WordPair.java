
public class WordPair {
	private String englishWord; 
	private String finnishWord; 
	
	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord; 
		this.finnishWord = finnishWord; 
	}
	
	String getEnglishWord() {
		return englishWord; 
	}
	String getFinnishWord() {
		return finnishWord; 
	}
	
	public String toString() {
		return englishWord + " = " + finnishWord; 
	}
	
}

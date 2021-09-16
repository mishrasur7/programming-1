
public class ObjectsWordPairArray {

	public static void main(String[] args) {
		WordPair[] wordArray =
			{new WordPair("class", "luokka"), new WordPair("object", "olio"), new WordPair("variable", "muuttuja")}; 
		for(WordPair wordObject : wordArray) {
			System.out.println(wordObject.getEnglishWord() + " = " + wordObject.getFinnishWord());
		}

	}

}

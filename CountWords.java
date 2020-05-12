package lession10;

/**
 * The Main class print count the number of words.
 * @author ARTUR
 * @since JDK 13.0.2
 */

public class CountWords {

	public static void main(String[] args) {
		String s = new String ("Help people interested in this repository understand your project by adding a README.");
					
		System.out.println(s.split(" ").length);
	}

}

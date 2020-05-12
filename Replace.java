package lession10;
/**
 * The Main class Replace all vowels in the line with a dash
 * @author ARTUR
 * @since JDK 13.0.2
 */

public class Replace {

	public static void main(String[] args) {

		// Замініть всі голосні букви в строці на тире (строка довільна).

		String s = "Help people interested in this repository understand your project by adding a README.";
		String t = "AOIUEaoiue";

		System.out.println(s);
		for (int i = 0; i < t.length(); i++) {
			s = s.replace(t.charAt(i), '-');
		}
		System.out.println(s);

	}

}

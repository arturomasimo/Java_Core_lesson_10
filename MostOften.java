package lession10;
/**
 * The Main class print which word is most often a word in a sentence.
 * @author ARTUR
 * @since JDK 13.0.2
 */

public class MostOften {

	public static void main(String[] args) {
	  //Знайти слово яке найчастіше зустрічається в реченні.
		
		String s,ss = new String();
		s="FluentU is a participant in the Amazon Services LLC Associates Program, an affiliate"+
		  " advertising program designed to provide a means for sites to earn advertising fees"+
		  " by advertising and linking to Amazon. Amazon and the Amazon logo are trademarks"+
		  "of Amazon, Inc, or its affiliates. We also participate in other affiliate "+
		  "advertising programs for products and services we believe in.";
		ss=s;
		// видаляємо всі розділові знаки
		String t = ".,-!:;?"; 
		
		for (int i = 0; i < t.length(); i++) {
			s = s.replace(t.charAt(i), ' ');
		}
		//розділяємо на окремі слова
		String[] s1 = s.split(" ");
		
		// робимо пошук слова яке максимально часто зустрічається
		int maxCount=1, maxCountLocal=1;
		String maxWord = s1[0], maxWordLocal=s1[0];
		for (int i=0; i<(s1.length-1);i++)
		{
			maxCount=1;
			for (int j = i+1; j < s1.length; j++)
				{
					if (s1[i].equalsIgnoreCase(s1[j]))
						{
							maxCount = maxCount+1;
							maxWord = s1[i];
						}
				}
			if (maxCount>maxCountLocal)
			{
				maxCountLocal=maxCount;
				maxWordLocal=maxWord;
			}
		}

		System.out.println(ss.substring(0, 127));
		System.out.println(ss.substring(127,250)); 
		System.out.println(ss.substring(250,s.length()));
		System.out.println();
		System.out.println("Максимально зустрічається слово "+maxWordLocal+" "+maxCountLocal+ " разів");
	}

}

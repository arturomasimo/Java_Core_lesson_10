package lession10;

import java.util.Scanner;

/**
 * The Main class determines whether the word polyndrome
 * @author ARTUR
 * @since JDK 13.0.2
 */

public class Polindrom {

	public static void main(String[] args) throws Exception{
		
		//поліндром
		//Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем,
		//паліндромом (приклади: «пилип», «ротор»). Якщо введено слово не з 5 букв, то
		//повідомляти про помилку. Програма повинна нормально обробляти слово, навіть якщо в
		//ньому використані символи різного регістру. Наприклад, слова «Комок» або «РОТОР» слід
		//також вважати паліндромами.

		System.out.print("Введіть слово із 5 симсолів для перевірки на поліндром: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (s.length() != 5)
		{
			throw new IllegalArgumentException("Введене слово не має 5 символів!");
			
		}
		else
		{
			String temp=s.toUpperCase();
			if ( (temp.charAt(0) == temp.charAt(4)) && (temp.charAt(1) == temp.charAt(3)) )
			{
				System.out.println("Введене слово "+ s + " є поліндромом!");
			}
			else
			{
				System.out.println("Введене слово "+ s + " HE є поліндромом!");
			}
				
		}
}
}
package src.learn.challenges;

import java.util.HashSet;
import java.util.Scanner;
/**
 * Pangrams are sentences constructed by using every letter of the alphabet at least once.
 * Lower-case and upper-case instances of a letter are considered the same.
 */
public class Pangram {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//  If input string size is less than 26
		char arr[] = input.toCharArray();
		if(arr.length<26){
			System.out.println("not pangram");
		} else{
		boolean result = isPangram(input);
		if(result)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		}
	}
	private static boolean isPangram(String input)
	{
		char arr[] = input.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<arr.length;i++)
		{
			int ch = arr[i];
			if((ch >= 65 && ch<=90))
				set.add(arr[i]);
			else if((ch>=97 && ch<=122))
			{
				int j = ch - 32;
				char y = (char)j;
				set.add(y);
			}
		}
		if(set.size() == 26)
			return true;
		else
			return false;
	}
}

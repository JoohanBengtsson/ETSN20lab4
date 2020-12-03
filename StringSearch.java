package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) throws FileNotFoundException {
//		File f1 = new File("input.txt"); // Creation of File Descriptor for input file
//		String[] words = null; // Intialize the word Array
//		FileReader fr = new FileReader(f1); // Creation of File Reader object
//		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
//		String s;
//		String input = "Java"; // Input word to be searched
//		int count = 0; // Intialize the word to zero
//		while ((s = br.readLine()) != null) // Reading Content from the file
//		{
//			words = s.split(" "); // Split the word using space
//			for (String word : words) {
//				if (word.equals(input)) // Search for the given word
//				{
//					count++; // If Present increase the count by one
//				}
//			}
//		}
//		if (count != 0) // Check for count not equal to zero
//		{
//			System.out.println("The given word is present for " + count + " Times in the file");
//		} else {
//			System.out.println("The given word is not present in the file");
//		}
//
//		fr.close();
		StringSearch maja = new StringSearch();
		maja.searchWordLines("berattelse.txt", "mattat");
	}

	public void searchWordLines(String fileName, String word) throws FileNotFoundException {
		File file;
		FileReader fr;

		
		Scanner	scan = new Scanner(new File(fileName));
		
		String[] words = null;
		String s;
		String search = word;
		ArrayList<String> listOfRows = new ArrayList<String>();

		while (scan.hasNextLine()) {
			s = scan.nextLine();
			words = s.split(" ");

			for (String tempWord : words) {
				if (tempWord.equals(search)) {
					listOfRows.add(s);
					break;
				}
			}
		}

		for (String rowToRead : listOfRows) {
			System.out.println(rowToRead);
		}
	}

}
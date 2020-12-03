package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) throws FileNotFoundException {
		StringSearch maja = new StringSearch();
		maja.searchWordLines("berattelse.txt", "mattat");
		//hello
	}

	public void searchWordLines(String fileName, String word) throws FileNotFoundException {
		File file;
		
		Scanner	scan = new Scanner(new File(fileName));
		
		String[] words = null;
		String string;
		String search = word;
		ArrayList<String> listOfRows = new ArrayList<String>();

		while (scan.hasNextLine()) {
			string = scan.nextLine();
			words = string.split(" ");

			for (String tempWord : words) {
				if (tempWord.equals(search)) {
					listOfRows.add(string);
					break;
				}
			}
		}

		for (String rowToRead : listOfRows) {
			System.out.println(rowToRead);
		}
	}

}
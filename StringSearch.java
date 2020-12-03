package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) throws FileNotFoundException {
		StringSearch maja = new StringSearch();
		maja.searchWordLines("berattelse.txt", "mattat");
	}

	public void searchWordLines(String fileName, String word) throws FileNotFoundException {
		File file;
		
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
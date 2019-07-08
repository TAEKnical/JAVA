package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IndexMaker {

	static Item[] Items = new Item[10000];
	static int n=0;

	public static void main(String args[]) {

		Scanner kb = new Scanner(System.in);

		while(true) {

			System.out.print("$ ");
			String command = kb.next();

			if(command.equals("read")) {
				String filename = kb.next();
				makeIndex(filename);
			}
			else if(command.equals("find")) {
				String str = kb.next();
				int index = findWord(str);
				if(index != -1)
					System.out.println("The word '" + Items[index].word + "' appears " + Items[index].count + " times.");
				else
					System.out.println("The word '" + str + "' does not appear.");
			}
			else if(command.equals("saveas")) {
				String filename = kb.next();
				saveAs(filename);
			}
			else if(command.equals("exit")) {
				break;
			}

		}

		for(int i=0; i<n; i++) {
			System.out.println(Items[i].word + " " + Items[i].count);
		}

		kb.close();

	}

	static void makeIndex(String filename){
		try {
			Scanner inFile = new Scanner(new File(filename));
			while(inFile.hasNext()) {
				String str = inFile.next();

				String trimmed = trimming(str);
				if(trimmed != null) {
					trimmed = trimmed.toLowerCase();
					addWord(trimmed);
				}
			}


			inFile.close();
		}catch (FileNotFoundException e) {
			System.out.println("No file");
			return;
		}
	}

	static String trimming(String str) {
		int i =0, j = str.length()-1;
		while(i <= str.length()-1 && !Character.isLetter(str.charAt(i))){
			i++;
		}

		while(j >= 0 && !Character.isLetter(str.charAt(j))){
			j--;
		}

		if(i > j)
			return null;

		String trimmed = str.substring(i,j+1); // 시작은 개구간, 마무리는 폐구간이기 때문. [i, j+1)
		return trimmed;
	}

	static void addWord(String str) {
		int index = findWord(str); // returns -1 if not found

		if(index != -1) {//found
			Items[index].count++;
		}
		else { //not found
			int i = n-1;
			while(i >= 0 && Items[i].word.compareTo(str) > 0) {
				Items[i+1] = Items[i];
				i--;
			}
			Items[i+1] = new Item();
			Items[i+1].word = str;
			Items[i+1].count = 1;
			n++;
		}
	}

	static int findWord(String str) {
		for(int i=0; i<n; i++) {
			if(Items[i].word.equalsIgnoreCase(str))
				return i;
		}
		return -1;
	}

	static void saveAs(String filename) {

		try {
			PrintWriter outFile = new PrintWriter(new FileWriter(filename));

			for(int i=0; i<n; i++) {
				outFile.println(Items[i].word + " " + Items[i].count);
			}

			outFile.close();

		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}
	}

}

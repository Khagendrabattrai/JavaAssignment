package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Q46S {

	public static void main(String[] args) {
		String word = "";
		String fileReadPath = "C:/Users/bhatt/Desktop/demo1.txt";

		int count = 0, maxcount = 0;
		ArrayList<String> words = new ArrayList<String>();
		String line;
		try (FileReader fr = new FileReader(fileReadPath); BufferedReader br = new BufferedReader(fr);// this helps to

		) {

			while ((line = br.readLine()) != null) { // end of file null hunxa
				String lowerCase = line.toLowerCase();
				String[] string = line.toLowerCase().split("\\s");
				//String[] string = line.toLowerCase().split("[, ?.@]+");
				for (int i = 0; i < string.length; i++) {
					words.add(string[i]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < words.size(); i++) {
			count = 1;
			for (int j = i + 1; j < words.size(); j++) {

				if (words.get(i).equals(words.get(j))) {
					count++;

				}

			}
			if (count > maxcount) {
				maxcount = count;
				word = words.get(i);
			}

		}
		System.out.println("The dublicate worword is :"+word);
	}

}

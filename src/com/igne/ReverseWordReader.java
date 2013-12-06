package com.igne;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseWordReader {

	public static void main(String[] args) {

		LinkedList<String> lines = formListFromFile();
		LinkedList<String> reverseLines = reverseLines(lines);
		outputLines(reverseLines);

	}

	protected static void outputLines(LinkedList<String> reverseLines) {
		for (String s : reverseLines) {
			System.out.println(s);
		}

	}

	protected static LinkedList<String> reverseLines(LinkedList<String> lines) {
		int numberOfLines = findNumberOfLinesInFile(lines.getFirst());
		LinkedList<String> reverseLines = new LinkedList();
		for (int i = 1; i <= numberOfLines; i++) {
			String line = lines.get(i);
			String revertLine = revertWords(line);
			reverseLines.add(revertLine);

		}

		return reverseLines;
	}

	protected static String revertWords(String line) {
		if(isStringEmptyOrNull(line)) {
			throw new IllegalArgumentException();
		}
		String[] words = line.split(" ");
		List<String> b = Arrays.asList(words);
		Collections.reverse(b);

		StringBuilder c = new StringBuilder();

		for (String s : b) {

			c.append(s);
			c.append(" ");

		}
		String s1 = c.toString();
		if(s1.length()>0) {
			return s1.substring(0, s1.length() - 1);
		}
		return "SUdas gaunas";
			
	}

	private static boolean isStringEmptyOrNull(String line) {
		if(line == null){
			return true;
		}
		line = line.replace(" ", "");
		if(line.isEmpty()) {
			return true;
		}
		return false;
	}

	protected static int findNumberOfLinesInFile(String first) {
		return Integer.parseInt(first);
	}

	protected static LinkedList<String> formListFromFile() {

		LinkedList<String> lines = null;
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"B-small-practice.in"));

			lines = new LinkedList<String>();

			String line;
			while ((line = in.readLine()) != null) {
				lines.add(line);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	@Override
	public String toString() {
		
		return "Igne";
	}

	
}

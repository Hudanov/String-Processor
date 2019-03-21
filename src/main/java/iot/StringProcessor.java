package iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class StringProcessor {
	private String input;
	private List<String> wordsWithHyphen;

	public static String readInputText() throws IOException {
		System.out.print("Enter String: ");
		try (Scanner in = new Scanner(System.in)) {
			return in.nextLine();
		}
	}

	public List<String> findWordsWithHyphen() {
		wordsWithHyphen = new ArrayList<String>();
		Pattern hyphen = Pattern.compile("(\\w*-\\w*)");
		Matcher matcher = hyphen.matcher(input);

		while (matcher.find()) {
			String foundWord = matcher.group();
			wordsWithHyphen.add(foundWord);
		}
		return wordsWithHyphen;
	}

	private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
		public int compare(String str1, String str2) {
			int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
			if (res == 0) {
				res = str1.compareTo(str2);
			}
			return res;
		}
	};

	public List<String> sort¿lphabetically() {
		Collections.sort(wordsWithHyphen, ALPHABETICAL_ORDER);
		return wordsWithHyphen;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public List<String> getWordsWithHyphen() {
		return wordsWithHyphen;
	}

	public void setWordsWithHyphen(List<String> wordsWithHyphen) {
		this.wordsWithHyphen = wordsWithHyphen;
	}

}

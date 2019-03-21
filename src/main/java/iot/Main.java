package iot;

import java.io.IOException;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		StringProcessor processor = new StringProcessor();
		try {
			processor.setInput(StringProcessor.readInputText());
		} catch (IOException e) {
			e.printStackTrace();
		}
		processor.findWordsWithHyphen();
		List<String> result = processor.sort¿lphabetically();

		if (result.isEmpty()) {
			System.out.println("Nothing Found");
		}

		for (String word : result) {
			System.out.println(word);
		}

	}
}

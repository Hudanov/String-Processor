package iot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {
	StringProcessor processor;
	String words;
	List<String> alphabeticallySorted;
	List<String> wordsWithHyphen;

	@BeforeEach
	public void setUp() {
		processor = new StringProcessor();
		String words = new String(
				"java , custom-built , user-generated, symmetry, apple , bad-tempered , concurrency ");
		wordsWithHyphen = new ArrayList<String>();
		wordsWithHyphen.add("custom-built");
		wordsWithHyphen.add("user-generated");
		wordsWithHyphen.add("bad-tempered");
		processor.setInput(words);
	}

	@Test
	public void testFindWordsWithHyphen() {

		Assertions.assertEquals(processor.findWordsWithHyphen(), wordsWithHyphen);
	}

	@Test
	public void testSortAlphabetically() {
		alphabeticallySorted = new ArrayList<String>();
		alphabeticallySorted.add("bad-tempered");
		alphabeticallySorted.add("custom-built");
		alphabeticallySorted.add("user-generated");
		processor.setWordsWithHyphen(wordsWithHyphen);

		Assertions.assertEquals(processor.sort¿lphabetically(), alphabeticallySorted);
	}
}

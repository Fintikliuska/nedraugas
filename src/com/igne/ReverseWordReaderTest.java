package com.igne;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseWordReaderTest {

	@Test
	public void testOutputLines() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Test
	public void testReverseLines() {
		fail("Not yet implemented");
	}

	@Test
	public void testRevertWords_ManyWordsInReverseOrder() {
		String revertLine = ReverseWordReader.revertWords("Boris sits on the couch");
		assertEquals("Failina", revertLine, "couch the on sits Boris");
	}

	@Test
	public void testRevertWords_TestingSingleWord() {
		String revertLine = ReverseWordReader.revertWords("Boris");
		assertEquals("Failina", revertLine, "Boris");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRevertWords_TestingSingleSpace() {
		String revertLine = ReverseWordReader.revertWords(" ");
		}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRevertWords_TestingEmptyString() {
		String revertLine = ReverseWordReader.revertWords("");
		}
	
	@Test
	public void testRevertWords_TestingSingleCharacter() {
		String revertLine = ReverseWordReader.revertWords("B");
		System.out.println(revertLine.length());
		assertEquals("Failina", revertLine, "B");
	}
	
	@Test
	public void testRevertWords_TestingMultipleSpaces() {
		String revertLine = ReverseWordReader.revertWords("   ");
		System.out.println(revertLine.length());
		assertEquals("Failina", revertLine, "   ");
	}
	
	@Test
	public void testFindNumberOfLinesInFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testFormListFromFile() {
		fail("Not yet implemented");
	}

}

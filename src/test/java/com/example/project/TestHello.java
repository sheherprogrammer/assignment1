package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

//import com.example.project.ProgramLauncher;


public class TestHello {

	@Test
	public void TestFib() {
		
		assertEquals(0, ProgramLauncher.computeFibonacciNumber(1));
		assertEquals(1, ProgramLauncher.computeFibonacciNumber(2));
		
		assertEquals(34, ProgramLauncher.computeFibonacciNumber(10));
		
	}
	
	@Test
	public void TestMedian() {
		
		int[] t1 = {1, 1, 2};
		assertEquals(1, ProgramLauncher.findMedianOfThree(t1));
		
		int[] t2 = {2, 1, 2};
		assertEquals(2, ProgramLauncher.findMedianOfThree(t2));
		
		int[] t3 = {2, 2, 1};
		assertEquals(2, ProgramLauncher.findMedianOfThree(t3));
		
		int[] t4 = {3, 3, 3};
		assertEquals(3, ProgramLauncher.findMedianOfThree(t4));
		
		int[] t5 = {4, 2, 1};
		assertEquals(2, ProgramLauncher.findMedianOfThree(t5));
		
		int[] t6 = {4, 1, 2};
		assertEquals(2, ProgramLauncher.findMedianOfThree(t6));

		
	}
	
	@Test
	public void TestValidMultChoice() {
		
		assertTrue(ProgramLauncher.validMultipleChoice('a'));
		assertTrue(ProgramLauncher.validMultipleChoice('b'));
		assertTrue(ProgramLauncher.validMultipleChoice('c'));
		assertTrue(ProgramLauncher.validMultipleChoice('d'));
		
		assertTrue(ProgramLauncher.validMultipleChoice('A'));
		assertTrue(ProgramLauncher.validMultipleChoice('B'));
		assertTrue(ProgramLauncher.validMultipleChoice('C'));
		assertTrue(ProgramLauncher.validMultipleChoice('D'));
		
		assertFalse(ProgramLauncher.validMultipleChoice('.'));
		assertFalse(ProgramLauncher.validMultipleChoice('q'));
		assertFalse(ProgramLauncher.validMultipleChoice('T'));
		
		
	}
}

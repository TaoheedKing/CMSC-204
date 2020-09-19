/**
 * Taoheed King
 * JUnit Lab
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GradeBookTester {

	GradeBook firstGradeBook;
	GradeBook secondGradeBook ;
	GradeBook thirdGradeBook ;
	
	@Before
	public void setUp() throws Exception {
		firstGradeBook = new GradeBook(5);
		secondGradeBook = new GradeBook(6);
		thirdGradeBook = new GradeBook(5);
	
		firstGradeBook.addScore(60);
		firstGradeBook.addScore(50);
		firstGradeBook.addScore(40);
		
		secondGradeBook.addScore(70.5);
		secondGradeBook.addScore(20);
	}

	@After
	public void tearDown() throws Exception {
		firstGradeBook = null;
		secondGradeBook = null;
		thirdGradeBook = null;
	}
	
	@Test
	public final void testMinimum() {
		assertEquals(40, firstGradeBook.minimum(), .001);
		assertEquals(20, secondGradeBook.minimum(), .001);
	}

	@Test
	public final void testSum() {
		assertEquals(150, firstGradeBook.sum(), .0001);
		assertEquals(90.5, secondGradeBook.sum(), .0001);
	}
	
	@Test
	public final void testAddScore() {
		assertTrue(firstGradeBook.toString().equals("60.0 50.0 40.0 "));
		assertTrue(secondGradeBook.toString().equals("70.5 20.0 "));
		
		assertEquals(3, firstGradeBook.getScoreSize(), .1);
		assertEquals(2, secondGradeBook.getScoreSize(), .1);
	}
	
	@Test
	public final void testFinalScore() {
		assertEquals(110, firstGradeBook.finalScore(), .001);
		assertEquals(70.5, secondGradeBook.finalScore(), .001);
		assertEquals(0, thirdGradeBook.finalScore(), .001);
	}
}

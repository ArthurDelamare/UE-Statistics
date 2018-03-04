package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestChapter {

	Chapter completedChapter;
	Chapter uncompletedChapter;
	
	@Before
	public void setUp() throws Exception {
		completedChapter = new Chapter();
		uncompletedChapter = new Chapter();
	}

	@Test
	public void FillTest() {
		//Test of the method with a completed chapter
		completedChapter.Fill("Projet Electronique A 5");
		assertEquals(completedChapter.grade, 'A');
		assertEquals(completedChapter.coefficient, 5);
		assertEquals(completedChapter.completed, true);
		assertEquals(completedChapter.title, " Projet Electronique");
		
		//Check in console
		System.out.println("Infos about the completed chapter :");
		System.out.println("Title = " + completedChapter.title);
		System.out.println("Grade = " + completedChapter.grade);
		System.out.println("Completed = " + completedChapter.completed);
		System.out.println("Coefficient = " + completedChapter.coefficient);
		
		//Test of the method with an uncompleted chapter
		uncompletedChapter.Fill("Projet Java 4");
		assertEquals(uncompletedChapter.grade, ' ');
		assertEquals(uncompletedChapter.coefficient, 4);
		assertEquals(uncompletedChapter.completed, false);
		assertEquals(uncompletedChapter.title, " Projet Java");
		
		//Check in console
		System.out.println("\nInfos about the uncompleted chapter :");
		System.out.println("Title = " + uncompletedChapter.title);
		System.out.println("Grade = " + uncompletedChapter.grade);
		System.out.println("Completed = " + uncompletedChapter.completed);
		System.out.println("Coefficient = " + uncompletedChapter.coefficient);
	}

}

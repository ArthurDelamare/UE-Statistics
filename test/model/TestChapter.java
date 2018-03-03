package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestChapter {

	Chapter completedChapter;
	
	@Before
	public void setUp() throws Exception {
		completedChapter = new Chapter();
	}

	@Test
	public void FillTest() {
		//
		completedChapter.Fill("Projet Electronique A 5");
		
		//Check in console
		System.out.println("Infos about the working chapter :");
		System.out.println("Title = " + completedChapter.title);
		System.out.println("Grade = " + completedChapter.grade);
		System.out.println("Completed = " + completedChapter.completed);
		System.out.println("Coefficient = " + completedChapter.coefficient);
	}

}

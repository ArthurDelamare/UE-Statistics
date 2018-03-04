package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUE {

	UE UE;
	
	@Before
	public void setUp() throws Exception {
		UE = new UE();
	}

	@Test
	public void FillTest() {
		UE.Fill("[S1] Fondamentaux scientifiques A");
		assertEquals(UE.getTitle(), "Fondamentaux scientifiques");
		assertEquals(UE.getGrade(), 'A');
		assertEquals(UE.isCompleted(), true);
		
		//Check in Console
		System.out.println(UE.getTitle());
		System.out.println(UE.getGrade());
		System.out.println(UE.isCompleted());
	}

}

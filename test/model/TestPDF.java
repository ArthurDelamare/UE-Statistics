package model;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPDF {

	PDF pdf;
	
	@Before
	public void setUp() throws Exception {
		this.pdf = new PDF();
		
	}

	@Test
	public void ReadTest() throws IOException {
		pdf.Read();
		String lines[] = pdf.getLines();
		assertNotNull(lines);
		for (String line : lines){
			System.out.println(line);
		}
	}

	@Test
	public void isUETest() throws IOException{
		pdf.Read();
		String lines[] = pdf.getLines();
		int trueCount = 0;
		for (String line : lines){
			if (pdf.isUE(line)){
				trueCount++;
			}
		}
		assertNotEquals(0, trueCount);
		System.out.println("------------------------------------");
		System.out.println("Nombre d'UE: " + trueCount);
	}
}

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
		this.pdf = new PDF("C:/Users/Arthur/Downloads/test.pdf");
		
	}

	@Test
	public void ReadTest() throws IOException {
		System.out.println("\n-------------------------------");
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
		System.out.println("\n------------------------------------");
		System.out.println("Nombre d'UE: " + trueCount);
	}
	
	@Test
	public void isChapterTest() throws IOException{
		System.out.println("\n------------------------------");
		pdf.Read();
		String lines[] = pdf.getLines();
		for (String line : lines){
			if (pdf.isUE(line)){
				pdf.UEList.add(new UE());
			}
			
			else if (pdf.isChapter(line)){
				System.out.println(line);
			}
		}
	}
}

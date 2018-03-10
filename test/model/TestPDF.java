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
		this.pdf = new PDF("C:/Users/Arthur/Downloads/Dossier_Synthese_Arthur_DELAMARE_Exia 17 Rouen A2_Semestre_3.pdf");
		
	}

	@Test
	public void ReadTest() throws IOException {
		System.out.println("\n------------------------------- Read Test");
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
		System.out.println("\n------------------------------------ isUE test");
		System.out.println("Nombre d'UE: " + trueCount);
	}
	
	@Test
	public void isChapterTest() throws IOException{
		System.out.println("\n------------------------------ isChapter Test");
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
	
	@Test
	public void FillUEListTest() throws IOException{
		this.pdf.Read();
		this.pdf.FillUEList();
		System.out.println("\n------------------------------ Final test");
		for(int i = 0; i < this.pdf.UEList.size()-1; i++){
			System.out.println("UE: " + (i+1));
			System.out.println(this.pdf.UEList.get(i).getTitle() + " - size : " + (this.pdf.UEList.get(i).size()));
			for(int j = 0; j < this.pdf.UEList.get(i).size(); j++){
				System.out.println(this.pdf.UEList.get(i).get(j).title);
			}
		}
	}
}

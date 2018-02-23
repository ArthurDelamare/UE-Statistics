package model;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDF {
	
	private String path = "";
	private String lines[] = {};
	
	public void Read() throws IOException{
		 try (PDDocument document = PDDocument.load(new File("C:/Users/Arthur/Downloads/Dossier_Synthese_Arthur_DELAMARE_Exia 17 Rouen A2_Semestre_3.pdf"))) {

	            document.getClass();

	            if (!document.isEncrypted()) {

	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                this.lines = pdfFileInText.split("\\r?\\n");
	            }
	            
	        }
	}
	
	public String[] getLines() {
		return lines;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}

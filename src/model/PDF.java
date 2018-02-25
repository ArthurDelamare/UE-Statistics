package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDF {
	
	private String path = "";
	private String lines[] = {};
	public ArrayList<UE> UELists = new ArrayList<UE>();
	
	public void Read() throws IOException{
		 try (PDDocument document = PDDocument.load(new File("C:/Users/Arthur/Downloads/test.pdf"))) {

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
	
	public boolean isUE(String line){
		
		for (int i=0; i<10; i++){
			if (line.contains("[S" + Integer.toString(i) + "]")){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isChapter(String line){
		
		for (int i=0; i<10; i++){
			if (line.endsWith(Integer.toString(i)) && UELists.size() != 0 && (line.contains("Page") == false)){
				return true;
			}
		}
		
		return false;
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

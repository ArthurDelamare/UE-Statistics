package model;

public class Chapter {

	public String title = "";
	public boolean completed = false;
	public char grade = ' ';
	public byte coefficient = 0; 
	
	public void Fill(String line){
		
		//String array containing the split parts 
		String splitLine[] = line.split(" ");
		if (splitLine[splitLine.length-2].matches("[a-zA-Z]")){
			this.grade = splitLine[splitLine.length-2].charAt(0);
			this.completed = true;
			this.coefficient = Byte.parseByte(splitLine[splitLine.length-1]);
			
			//
			for(int i = 0; i < splitLine.length-2; i++){
				this.title = this.title + " " + splitLine[i];
			}
		}
		else {
			this.coefficient = Byte.parseByte(splitLine[splitLine.length-1]);
			for(int i = 0; i < splitLine.length-1; i++){
				this.title = this.title + " " + splitLine[i];
			}
		}
	}
	
}
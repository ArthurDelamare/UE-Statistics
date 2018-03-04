package model;

import java.util.ArrayList;

public class UE extends ArrayList<Chapter> {
	
	private String title = "";
	private boolean completed = false;
	private char grade = ' ';
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void Fill(String line){
		//
		if (line.matches("(.*)[A-Z]")){
			this.completed = true;
			
			String splitLine[] = line.split(" ");
			for(int i = 1; i < splitLine.length-1; i++){
				if (this.title == ""){
					this.title = splitLine[i];
				}
				else{
					this.title = this.title + " " + splitLine[i];
				}
			}
			
			this.grade = splitLine[splitLine.length-1].charAt(0);
		}
		
		//
		else{
			String splitLine[] = line.split(" ");
			for(int i = 1; i < splitLine.length-1; i++){
				if (this.title == ""){
					this.title = splitLine[i];
				}
				else{
					this.title = this.title + " " + splitLine[i];
				}
			}
		}
	}

	public void clean(){
		System.out.println("Do a cleaning of the UE.");
	}

}
package studentRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int studId;

	Student(String name, int id){
		this.name = name;
		studId = id;
		gradeSheet = new ArrayList<>();
		System.out.println("student " + name + " initialized");
	}
	
	public int getId() { return studId; }
	public String getName() { return name; }
	public List<TranscriptEntry> getGrades() { return gradeSheet; }
	public Transcript getTranscript() { return new Transcript(gradeSheet, this); }
	
	public void setName(String s) { name = s; }
	public void setId(int i) { studId = i; }
	public void setGrades(TranscriptEntry entry) { 
		System.out.println(name);
		gradeSheet.add(entry);
	}
	// get transcript method here
	// static method from transcript to get transcript
}

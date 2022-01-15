package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int studId;
	private List<TranscriptEntry> gradeSheet;
	
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
	
	
//	public String getName() { return name; }
//	
//	public int getId() { return studId; }
//	
//	@Override
//	public String toString() {
//		return " [ " + getId() + " : " + getName() + " ] \n";
//	}
}

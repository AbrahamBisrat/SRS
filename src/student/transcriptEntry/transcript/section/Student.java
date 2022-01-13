package student.transcriptEntry.transcript.section;

import java.util.ArrayList;

public class Student {
	private String name;
	private int studId;
	private List<TranscriptEntry> grades;
	
	Student(String name, int id){
		this.name = name;
		studId = id;
		grades = new ArrayList<TranscriptEntry>;
	}
	
	public Transcript getTranscript() { 
		return new Transcript(grades, this); 
	}
	
	public String getName() { return name; }
	
	public int getId() { return studId; }
	
	@Override
	public String toString() {
		return " [ " + getId() + " : " + getName() + " ] \n";
	}
}

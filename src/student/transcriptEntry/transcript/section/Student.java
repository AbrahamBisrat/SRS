package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int studId;
	private List<TranscriptEntry> transcriptEntries;
	private Transcript transcript; 
	
	// package level
	Student(String name, int id){
		this.name = name;
		studId = id;
		transcriptEntries = new ArrayList<TranscriptEntry>();	
	}
	
	public TranscriptEntry addTranscriptEntry(TranscriptEntry e) {
		transcriptEntries.add(e);
		return e;
	}
	
	public String getName() { return name; }
	public int getId() { return studId; }
	public List<TranscriptEntry> getTranscriptEntries() { return transcriptEntries; }
	
	@Override
	public String toString() {
		return " [ " + getId() + " : " + getName() + " ] \n";
	}
}

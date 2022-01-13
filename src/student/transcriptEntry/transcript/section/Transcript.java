package student.transcriptEntry.transcript.section;

import java.util.List;

public class Transcript {
	Student student;
	List<TranscriptEntry> singleEntries;
	
	Transcript(Student s){
		this.student = s;
	}
	
	public TranscriptEntry addSingleEntry(TranscriptEntry t) {
		singleEntries.add(t);
		return t;
	}
	
	@Override
	public String toString() {
		String allEntries = "";
		
		for(TranscriptEntry singleEntry : singleEntries)
			allEntries += singleEntry;
		
		return " [ " + student.getName() 
				+ "  Id Number : " + student.getId() 
				+ " \t  >> TRANSCRIPT << \n"
				+ allEntries;
	}
}

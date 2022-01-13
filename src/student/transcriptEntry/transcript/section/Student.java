package student.transcriptEntry.transcript.section;

public class Student {
	private String name;
	private int studId;
	private Transcript transcript; // Collection of TranscriptEntries
	
	Student(String name, int id){
		this.name = name;
		studId = id;
		transcript = new Transcript(this);
	}
	
	public TranscriptEntry addTranscriptEntry(TranscriptEntry e) {
		transcript.addSingleEntry(e);
		return e;
	}
	
	public Transcript getTranscript() { return transcript; }
	
	public String getName() { return name; }
	
	public int getId() { return studId; }
	
	@Override
	public String toString() {
		return " [ " + getId() + " : " + getName() + " ] \n";
	}
}

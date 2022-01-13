package student.transcriptEntry.transcript.section;

public class Section {
	private String courseName;
	private String courseCode;
	private Lecturer lecturer;
	private String schedule;
	List<TranscriptEntry> transcripts;
	
	// package level
	Section()
	
	
	
	public String getCourseName() { return courseName; }
	public String getCourseCode() { return courseCode; }
	public String getSchedule() { return schedule; }
	public Lecturer getLecturer() { return lecturer; }
	
	
	// Override the toString method
}

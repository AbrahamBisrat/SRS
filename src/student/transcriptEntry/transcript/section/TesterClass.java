package student.transcriptEntry.transcript.section;

public class TesterClass {
	public static void main(String[] args) {
		
		Course mpp = new Course("MPP", "CS401");
		Course fpp = new Course("FPP", "CS391");
		Course algo = new Course("Algorithm", "CS540");
		
		
		Lecturer paulCorazza = new Lecturer("Prof. Paul Corazza", "MIU_0001");
		paulCorazza.assignCourse(mpp);
		
		
		
	}
}

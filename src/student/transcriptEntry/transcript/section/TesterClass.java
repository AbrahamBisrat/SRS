package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class TesterClass {
	public static void main(String[] args) {
		
		Course fpp = new Course("FPP", "CS391");
		Course mpp = new Course("MPP", "CS401");
		Course algo = new Course("Algo", "CS540");
		
		
		Lecturer l = new Lecturer("Prof. Paul Corazza", "MIU_0001");
		l.assignCourse(mpp); // this should be section
		l.assignCourse(algo);
		l.assignCourse(fpp);
		
		
		System.out.println(l);
		
		System.out.println(mpp + "\n" + fpp + "\n" + algo + "\n");
		
		List<String> fppS = new ArrayList<String>();
		fppS.add("Monday 8:30 AM");
		fppS.add("TuesDay 1:30 PM");
		fppS.add("Wednesday 10:30 AM");
		fppS.add("Sunday 2:30 AM"); // good luck!
		
		
		Section mondayFpp = new Section(fpp, l, fppS);
		
		System.out.println(mondayFpp);
		
		Student s = new Student("Abraham Bisrat", 613787);
		mondayFpp.assignStudent(s);
		
		System.out.println("\n After Adding a student \n\n" + mondayFpp);
		
		// adding course / section to student
		s.addTranscriptEntry(new TranscriptEntry(s, mondayFpp, "A+"));
		
		System.out.println("\n\n Transcript \n\n" + s.getTranscript());
	}
}

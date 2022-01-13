package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class TesterClass {
	public static void main(String[] args) {
		
		Course mpp = new Course("MPP", "CS401");
		Course fpp = new Course("FPP", "CS391");
		Course algo = new Course("Algo", "CS540");
		
		
		Lecturer l = new Lecturer("Prof. Paul Corazza", "MIU_0001");
		l.assignCourse(mpp);
		l.assignCourse(algo);
		l.assignCourse(fpp);
		
		
		System.out.println(l);
		
		System.out.println(mpp + "\n" + fpp + "\n" + algo + "\n");
		
		List<String> fppScheduleForL = new ArrayList<String>();
		fppScheduleForL.add("Monday 8:30 AM");
		fppScheduleForL.add("TuesDay 1:30 PM");
		fppScheduleForL.add("Wednesday 10:30 AM");
		fppScheduleForL.add("Sunday 2:30 AM"); // good luck!
		
		
		Section mondayFpp = new Section(fpp, l, fppScheduleForL);
		
		System.out.println("cName " + mondayFpp.getCourse().getCourseName());
		
		System.out.println(mondayFpp);
	}
}

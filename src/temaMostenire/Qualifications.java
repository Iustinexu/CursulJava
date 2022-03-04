package temaMostenire;

public class Qualifications extends Teacher{
	
	public static void main(String[] args) {
		
		
	Teacher tch = new Teacher();
	tch.setCourse("Java");
	tch.setExperienceYears(3);
	tch.setSchedule("Afternoon");
	}
	
	public Qualifications(String Course, int ExperienceYears, String Schedule ) {
		setCourse(Course);
		setExperienceYears(ExperienceYears);
		setSchedule(Schedule);
		
		
	}
}
	
	
	
	
	
	



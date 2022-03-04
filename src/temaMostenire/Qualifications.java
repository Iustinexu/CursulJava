package temaMostenire;

public class Qualifications extends Teacher{
	
	
		
		
	public Qualifications() {}
	
	public Qualifications(String Course, int ExperienceYears, String Schedule ) {
		setCourse(Course);
		setExperienceYears(ExperienceYears);
		setSchedule(Schedule);
	
	}
	
		public void verify() {
			
			if(getCourse().equalsIgnoreCase("Java")&&getExperienceYears()>=3&&getSchedule().equalsIgnoreCase("Afternoon")) {
				System.out.println("You can teach at this school");
			}else {
				System.out.println("Nex");
			}
		}
	}

		
	

	
	
	
	
	
	



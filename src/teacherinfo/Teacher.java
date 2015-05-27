package teacherinfo;

public class Teacher {

	public static void main(String[] args) {
		
		TeacherDetails td1 = new TeacherDetails();
		td1.name = "John";
		td1.id =37;
		td1.subject = "Infornation Technology";
		System.out.println("Teacher Info");
		System.out.println("Name: " + td1.name);
		System.out.println("ID: "+ td1.id);
		System.out.println("Subject: "+ td1.subject);
		
		
		TeacherDetails td2 = new TeacherDetails();
		td2.name = "Peter";
		td2.id =22;
		td2.subject = "Tele Comunications ";
		System.out.println("Teacher Info");
		System.out.println("Name: " + td2.name);
		System.out.println("ID: "+ td2.id);
		System.out.println("Subject: "+ td2.subject);
	}

}

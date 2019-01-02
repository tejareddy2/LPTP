package oops;

public class InheritanceMain {

	public static void main(String args[]){
		Teacher teacher=new Teacher();
		
		teacher.setId(10);
		teacher.setName("Vishnu");
		teacher.setGender('M');
		teacher.setSal(2000.00);

		
		System.out.println("Id is:" +teacher.getId());
		System.out.println("name is:" +teacher.getName());
		System.out.println("Gender is:" +teacher.getGender());
		System.out.println("Sal is:" +teacher.getSal());
		
		
		Student student=new Student();
		
		student.setId(11);
		student.setName("Rahul");
		student.setGender('M');
		student.setPercentage(77.7);

		
		System.out.println("Id is:" +student.getId());
		System.out.println("name is:" +student.getName());
		System.out.println("Gender is:" +student.getGender());
		System.out.println("Sal is:" +student.getPercentage());
		
		
		
	}
}

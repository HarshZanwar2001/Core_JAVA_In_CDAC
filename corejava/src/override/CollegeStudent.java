package override;

public class CollegeStudent extends Student {

	private int semester;

	public CollegeStudent(int roll, float per, int semester) {
		super(roll, per);
		this.semester = semester;
	}

	public int getSemester() {
		return semester;
	}
	public void show()
	{
		super.show();
		System.out.println("Semester = "+getSemester());
	}
	
}

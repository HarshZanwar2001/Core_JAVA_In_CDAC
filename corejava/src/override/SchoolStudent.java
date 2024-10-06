package override;

public class SchoolStudent extends Student {
	private String classname;

	public SchoolStudent(int roll, float per, String classname) {
		super(roll, per);
		this.classname = classname;
	}

	public String getClassname() {
		return classname;
	}

	public void show() {
		super.show();
		System.out.println("Class Name ="+getClassname());
	}
	

}


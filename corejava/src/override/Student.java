package override;

public class Student {
	private int roll;
	private float per;
	public Student(int roll, float per) {
		//super();
		this.roll = roll;
		this.per = per;
	}
	public int getRoll() {
		return roll;
	}
	public float getPer() {
		return per;
	}
	public void show()
	{
		System.out.println("Roll No = "+getRoll());
		System.out.println("Percentage ="+getPer());
	}
	public String getClassname() {
		// TODO Auto-generated method stub
		return null;
	}

}
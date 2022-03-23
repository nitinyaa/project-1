class A {
	String Name = "Janhvi";
	int id = 25;
	static String Faculty = "Java";
	static String SName = "SDAC";

	public void showName_Id() {
		System.out.println(Name);
		System.out.println(id);
	}

	static void showFaculty_SName() {
		System.out.println(Faculty);
		System.out.println(SName);

	}
}

public class Main1 {
	public static void main(String[] args) {
		A ob = new A();
		A.showFaculty_SName();
		ob.showName_Id();

	}
}

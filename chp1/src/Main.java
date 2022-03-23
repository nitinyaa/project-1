class Emp {
	String Name;
	int Id ;
	String Add;
	double Sal;

	public Emp(String name, int id, String add, double sal) {
		super();
		Name = name;
		Id = id;
		Add = add;
		Sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", Id=" + Id + ", Add=" + Add + ", Sal=" + Sal + "]";
	}

	/*
	 * void showInfo() { System.out.println(Name); System.out.println(Id);
	 * System.out.println(Add); System.out.println(Sal); }
	 */

}

public class Main {
	public static void main(String[] args) {
		Emp ob = new Emp("jerry", 05, "Bhayander", 20000);
		System.out.println(ob);

	}

}

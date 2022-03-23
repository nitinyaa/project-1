class Bank {

	void meth(int a) {
		System.out.println(a);

	}

	void meth(int a, int b) {
		System.out.println(a+b);
	}

}

public class main2 {

	public static void main(String[] args) {
	 Bank ob=new Bank();
	 ob.meth(100);
	 ob.meth(100, 200);
	 
		
		
		
	}

}

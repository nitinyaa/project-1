package chp1;

class Add {

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

}

public class Main {
public static void main(String[] args) {
	Add a = new Add();
	System.out.println(a.sum(10, 20));
}
}

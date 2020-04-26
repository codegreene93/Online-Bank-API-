package memory;

public class Student {
	int a;
	boolean b;
	short s;
	float f;
	double d;
	
	public Student() {}

	public Student(int a, boolean b, short s, float f, double d) {
		this.a = a;
		this.b = b;
		this.s = s;
		this.f = f;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + ", s=" + s + ", f=" + f + ", d=" + d + "]";
	}
	
	
	public static void main(String[] args) {
		System.out.println((new Student()));
		
		System.out.println((new Student(1,true,(short)10,2.4f,4.55)));
	
	}
	
}

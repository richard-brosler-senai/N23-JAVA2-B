
public class TesteIncremento {
	public static void main(String[] args) {
		int count=15;
		int a, b, c, d;
		a = count++;//15
		b = count; //16
		c = ++count;//17
		d = count;//17
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
}

public class Tabuada {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		while (x <= 10) {
			System.out.println("\nTabuada do " + x + "\n");
			while (y <= 10) {
				System.out.println(x + " * " + y + " = " + x * y);
				y += 1;
			}
			x += 1;
			y = 1;
		}
	}
}

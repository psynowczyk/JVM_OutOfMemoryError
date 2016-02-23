package jvmi.example.outofmem;

public class App {
	public static void main(String[] args) {
		String text = new String("OutOfMemoryError");
		while (true) {
			text = text + text;
		}
	}
}

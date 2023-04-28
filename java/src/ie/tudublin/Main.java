package ie.tudublin;

public class Main
{	

	public static void scene1()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Scene1());
	}

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		scene1();
	}
}

public class Main {
	public static void main(String[] args) {
		Fabrica f = new Fabrica();
		
		System.out.println("Total time taken: " + f.start(5) + " min.");
		System.out.println(f.first);
	}
}

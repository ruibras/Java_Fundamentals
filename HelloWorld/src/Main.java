public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World v2");
//using ternary operator
		for (int i = 0; i < args.length - 1; i++) {
			System.out.print(args[i]);
			
			System.out.print(args[i] + ((i == args.length - 1) ? "\n" : " "));
			
		}
	}
}



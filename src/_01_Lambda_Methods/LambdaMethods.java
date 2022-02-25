package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "backwards");
		
		//3
		System.out.println();
		printCustomMessage((s) -> {
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					System.out.print((s.charAt(i) + "").toLowerCase());
				}else{
					System.out.print((s.charAt(i) + "").toUpperCase());
				}
			}
		}, "caseswap");
		
		//4
		System.out.println();
		printCustomMessage((s) -> {
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + (i != s.length()-1 ? "." : ""));
			} 
		}, "periods");
		
		
		//5
		System.out.println();
		printCustomMessage((s) -> {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
					System.out.print(s.charAt(i));
				}
			}
		}, "what are vowels?");
		
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

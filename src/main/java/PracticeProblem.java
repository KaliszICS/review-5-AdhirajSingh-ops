import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input = s.nextDouble();
		double absoluteValue = Math.abs(input);
		System.out.println(absoluteValue);
		s.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = s.nextDouble();
		System.out.print("Input another number: ");
		double b = s.nextDouble();
		double div = a / b;
		System.out.println(Math.floor(div));
		System.out.println(Math.ceil(div));
		s.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double c = s.nextDouble();
		double sqrt = Math.sqrt(c);
		System.out.println(Math.round(sqrt));

		s.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = s.nextDouble();
		System.out.print("Input another number: ");
		double e = s.nextDouble();
		double power = Math.pow(d, e);
		System.out.println(power);
		s.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double f = s.nextDouble();
		System.out.print("Input another number: ");
		double g = s.nextDouble();
		System.out.print("Input one more number: ");
		double h = s.nextDouble();

		System.out.println(Math.max(Math.max(f, g),h));
		System.out.println(Math.min(Math.min(f, g),h));
		s.close();
	}
	public static void q6() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();

        boolean result = sentence.toLowerCase().contains("on");
		System.out.println(result);

		s.close();
	}
	public static void q7() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String input = s.nextLine();

		boolean isMango = "mango".equalsIgnoreCase(input);
		System.out.println(isMango);
		s.close();
	}
	public static void q8() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		System.out.print("Input a letter: ");
		char letter = s.nextLine().charAt(0);
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
		s.close();
	}

	public static void q9() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		int length = sentence.length();
		System.out.println("Your sentence is " + length + " characters long");
		s.close();
	}
	public static void q10() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		System.out.print("Input a word to replace: ");
		String wordReplace = s.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String replaceWord = s.nextLine();
		String newSentence = sentence.replace(wordReplace, replaceWord);
		System.out.println(newSentence);
		s.close();

	}

	public static void q11() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine().trim();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		s.close();
	}

	public static void q12() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		System.out.println(word.substring( 0, 4));
		System.out.println(word.substring(word.length() - 4));
		s.close();
	}
	

}

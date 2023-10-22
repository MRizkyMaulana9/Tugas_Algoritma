import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

		String kata;
		String kataPalindrome = "";
		int panjangkata;

		System.out.println("\t Menentukan kata palindrome \n");
		System.out.println("Masukan Kata");
		kata = input.nextLine();
			panjangkata = kata.length();
			
			for (int i = panjangkata -1; i>=0; i--){
				kataPalindrome = kataPalindrome + kata.charAt(i);
		} if (kata.equals(kataPalindrome)){
			System.out.println("Kata " + kata + " termasuk Palindrome" );
		}else {
			System.out.println("Kata " + kata + " Bukan termasuk Palindrome" );
		}
			input.close();
		}
	}




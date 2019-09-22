import java.util.Scanner;
public class Decrypt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter four-digit integer:");
		String fourDig = scan.next();
		if (fourDig.length() == 4) {
		scan.close();
		
		// Lines 7-10 get the integer to be decrypted.
		
		System.out.println("Integer entered: " + fourDig);
		
		String codeSource = String.valueOf(fourDig);
		
		int oldD1 = Integer.valueOf(codeSource.substring(0,1));
		int oldD2 = Integer.valueOf(codeSource.substring(1,2));
		int oldD3 = Integer.valueOf(codeSource.substring(2,3));
		int oldD4 = Integer.valueOf(codeSource.substring(3,4));
		
		int newD1 = ((oldD1+3)%10);
		int newD2 = ((oldD2+3)%10);
		int newD3 = ((oldD3+3)%10);
		int newD4 = ((oldD4+3)%10);
		
		System.out.println("Decrypted integer: " + newD3 + newD4 + newD1 + newD2);
		
		// And there's the decrypted code!
		} else {
			System.out.println("Integer must be 4 digits! No more, no less!");
		}
	}
}
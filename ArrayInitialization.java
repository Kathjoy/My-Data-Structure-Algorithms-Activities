import java.util.Scanner;

	public class ArrayInitialization {
		public static void main (String [] args) {

			String [] num = new String[3];

			num[0] = "Siya";
			num[1] = "raman";
			num[2] = "unta";

			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
		}
	}

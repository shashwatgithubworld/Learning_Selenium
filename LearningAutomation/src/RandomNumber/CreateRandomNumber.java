package RandomNumber;

import java.util.Random;

public class CreateRandomNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		int no = r.nextInt();
		String name = "Shashwat"+no;
		
		System.out.println(name);

	}

}

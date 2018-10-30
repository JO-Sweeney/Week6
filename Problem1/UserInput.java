package Problem1;

import java.util.Scanner;

public class UserInput {

	private Scanner kboard;
	
	public UserInput(){
		kboard = new Scanner(System.in);
	}
	
	public String getString(){
		String var = kboard.next();
		return var;
	}
	
	public int getInt(){
		int var = kboard.nextInt();
		return var;
	}
	
	public void closeKboard(){
		kboard.close();
	}
}

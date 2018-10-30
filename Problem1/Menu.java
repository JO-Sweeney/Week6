package Problem1;

import java.util.Scanner;

public class Menu {
	
	private Unit newUnit;
	private UserInput menuInput;
	
	public Menu(){
		newUnit = new Unit();	//every menu would have a unit that it is a menu for
	}
	
	
	public int displayMenu(){
		System.out.println("\nWelcome to UHI Menu");
		menuInput = new UserInput();					//send any potential for user input to menuInput object
		int choice = 0;
		System.out.println("Press 1. to add a new student");
		System.out.println("Press 2. to remove a student");
		System.out.println("Press 3. to display the class");
		System.out.println("Press 4. to search and display a student");
		System.out.println("Press 5. to display passed students");
		System.out.println("Press 6. to display the pass rate");
		System.out.println("Press 7. to set a student's result");
		System.out.println("Press 8. to exit");
		choice = menuInput.getInt();
		return choice;
		
	}
	
	
	public void menuChoice() {
	
		boolean runProgram = true;
		
		while(runProgram) {
			int choice = displayMenu();				//display the menu for the user each loop
			switch (choice) {
	        case 1:
	        		newUnit.addStudent();						 		//add student
	        		System.out.println("Student added");
	                 break;
	        case 2:  
	        		newUnit.removeStudent();							//remove student
	        		System.out.println("Student removed");
	                 break;
	        case 3:  
	        		newUnit.displayClass();								//display list of class
	                 break;
	        case 4: 
	        		newUnit.displayStudent();							//search and display student
	                 break;	
	        case 5: 
	        		newUnit.displayPassed();							 //display passed students
	                 break;
	        case 6: 
	        		newUnit.getPassRate();								 //display pass rate
	                 break;
	        case 7:
	        		newUnit.setResult();								 //set pass/fail for a student
	        		System.out.println("Result has been set");
	                 break;
	        case 8:  
	        		runProgram = false;									//exit 
	        		System.out.println("Bye!");
	        		menuInput.closeKboard();
	                 break;
	        default: 
	        		System.out.println("You must pick an option from the menu");	//choose again
	                 break;
			}
		}
	}

}

package Problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Unit {
	
	private String mCode;
	private String mTitle;
	private ArrayList <Student> mStudents;
	private UserInput unitInput = new UserInput();
	
	public Unit(){
		mStudents = new ArrayList<Student>();
	}
	
	public void addStudent(){
		mStudents.add(new Student());
	}
	
	public void removeStudent(){
		System.out.println("Please enter the student number of the student you wish to remove.");
		String num = unitInput.getString();
		boolean found = false;
		for(int i = 0; i < mStudents.size(); i++){
			String foundNum = mStudents.get(i).searchStudent();
			if(num.equals(foundNum)){
				mStudents.remove(i);
				found = true;
			}
		}
		if(found == false) {
			System.out.println("No student found");
		}
	}
	
	//Displays the entire list of students enrolled
	public void displayClass(){
		for(int i = 0; i < mStudents.size(); i++){
			mStudents.get(i).displayStudent();
		}
	}
	
	//Displays a specific student
	public void displayStudent(){
		System.out.println("Please enter the number of the student to display");
		String num = unitInput.getString();
		boolean found = false;
		for(int i = 0; i < mStudents.size(); i++){
			String foundNum = mStudents.get(i).searchStudent();
			if(num.equals(foundNum)){
				mStudents.get(i).displayStudent();
				found = true;
			}
		}
		if(found == false) {
			System.out.println("No student found");
		}
	}
	
	public void displayPassed(){
		for(int i = 0; i < mStudents.size(); i++){
			if(mStudents.get(i).getResult().equalsIgnoreCase("Pass")){
				mStudents.get(i).displayStudent();
			}
		}
	}
	
	public void getPassRate(){
		int studentPass = 0;
		for(int i = 0; i < mStudents.size(); i++){
			boolean passed = mStudents.get(i).checkPassed();
			if(passed){
				studentPass++;
			}
		}
		double percentPass = ((double)studentPass/(double)mStudents.size())*100;
		System.out.println("Pass percentage = "+percentPass+"%");
	}
	
	public void setResult(){
		System.out.println("Please enter the number of the student to give their result");
		String num = unitInput.getString();
		boolean found = false;
		for(int i = 0; i < mStudents.size(); i++){
			String foundNum = mStudents.get(i).searchStudent();
			if(num.equals(foundNum)){
				found = true;
				System.out.println("Please enter the result");
				String result = unitInput.getString();
				if(result.equalsIgnoreCase("pass")){
					mStudents.get(i).setPass();
				}else if(result.equalsIgnoreCase("fail")){
					mStudents.get(i).setFail();
				}else{
					System.out.println("Sorry, the result could not be inputted");
				}
				
			}
		}
		if(found == false) {
			System.out.println("No student found");
		}
	}
	
	
}

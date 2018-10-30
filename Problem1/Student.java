package Problem1;

import java.util.Scanner;

public class Student {
	
	private String mNumber;
	private String mForename;
	private String mSurname;
	private String mEmail;
	private String mMobileNo;
	private String mResult;
	private UserInput studentInput = new UserInput();
	
	//All details inputted manually via method
	public Student(String number){
		setDetails(number);
	}
	
	//All details given in parameters (mostly for testing)
	public Student(String number, String forename, String surname, String email, String mobile, String result){
		mNumber = number;
		mForename = forename;
		mSurname = surname;
		mEmail = email;
		mMobileNo = mobile;
		mResult = result;
	}
	
	//Student No. and Pass/Fail are given in parameter, with other member variables being inputted manually
	public Student(String number, String result){
		mNumber = number;
		mResult = result;
		System.out.println("Your number has been set to "+mNumber);
		System.out.println("Please enter your first name");
		mForename = studentInput.getString();
		System.out.println("Please enter your last name");
		mSurname = studentInput.getString();
		System.out.println("Please enter your email address");
		mEmail = studentInput.getString();
		System.out.println("Please enter your mobile number");
		mMobileNo = studentInput.getString();
	}
	
	//All details have to be entered (standard constructor)
	public Student() {
		System.out.println("Please enter your student number");
		mNumber = studentInput.getString();
		System.out.println("Please enter your first name");
		mForename = studentInput.getString();
		System.out.println("Please enter your last name");
		mSurname = studentInput.getString();
		System.out.println("Please enter your email address");
		mEmail = studentInput.getString();
		System.out.println("Please enter your mobile number");
		mMobileNo = studentInput.getString();
		System.out.println("Please note you must assign a grade seperately");
		mResult = "Not Set";
	}
	
	//just used to set details in a method as opposed to constructor
	public void setDetails(String number){
		mNumber = number;
		System.out.println("Your number has been set to "+mNumber);
		System.out.println("Please enter your first name");
		mForename = studentInput.getString();
		System.out.println("Please enter your last name");
		mSurname = studentInput.getString();
		System.out.println("Please enter your email address");
		mEmail = studentInput.getString();
		System.out.println("Please enter your mobile number");
		mMobileNo = studentInput.getString();

	}
	
	public void setPass(){
		mResult = "Pass";
	}
	
	public void setFail(){
		mResult = "Fail";
	}
	
	public String searchStudent(){
		return mNumber;
	}
	
	public boolean checkPassed(){
		if(mResult.equalsIgnoreCase("pass")){
			return true;
		}else{
			return false;
		}
	}
	
	public String getResult(){
		return mResult;
	}
	
	public void displayStudent(){
		System.out.println("\nStudent Number: "+mNumber);
		System.out.println("Name: "+mForename+" "+mSurname);
		System.out.println("Email: "+mEmail);
		System.out.println("Mobile Number: "+mMobileNo);
		System.out.println("Result: "+mResult);
	}
	

}	


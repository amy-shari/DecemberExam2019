/********************************************************************
 * Programmer:	Amy Mann
 * Class:       CS30S
 *
 * Assignment:  December Exam
 *
 * Description: Employee client uses employee class to 
 * determine the wage, hours, ID, regular pay,
 * overtime pay, and gross pay of employee objects
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class EmployeeClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
        final int MAXSIZE = 100;
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ ]+";	// delimiter string for splitting input string
        String[] tokens = null;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
        String assignmentName = "December Exam";
        
        double wage = 0.00;
        int hours = 0;
        
        Employee employee[] = new Employee[MAXSIZE];
        
        int arrayLength = 0;          // the length of the employee array
    	
        int additionalEmployeeHours = 0; // the hours worked by the additional employee
        double additionalEmployeeWage = 0;  // the wage worked by the additional employee        
    
    // ***** create objects *******
    
        ProgramInfo programInfo;
        programInfo = new ProgramInfo(assignmentName);
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        programInfo.createBanner();
        
        programInfo.printBanner();
        programInfo.printBanner(fout);
	    	
    // ************************ get input **********************

    // ************************ processing ***************************
        
        strin = fin.readLine();
        
        while(strin != null){
            //begin while data is being read
            tokens = strin.split(delim);                // splits strin
            hours = Integer.parseInt(tokens[0]);        // parses hours
            wage = Double.parseDouble(tokens[1]);       // parses wages
            employee[arrayLength] = new Employee(wage, hours); //creates an employee on the array
            arrayLength++;
            strin = fin.readLine();
        } // end of while loop

        additionalEmployeeHours = 50;       // determines the additional employee's hours 
        additionalEmployeeWage = 12.5;      // determines the additional employee's wage
        
        Employee additionalEmployee = new Employee();   // the creates the additional employee using default constructor
        
        additionalEmployee.setHours(additionalEmployeeHours);  // sets the wage of the additional employee
        additionalEmployee.setWage(additionalEmployeeWage);    // sets the hours of the additional employee
        
    // ************************ print output ****************************
        
        for(int i = 0; i < arrayLength; i++){
            System.out.println(employee[i].toString());
        } // end of for loop for the employees using the intialized constructor
        
        System.out.println(additionalEmployee.toString());  // prints additional employee records

    // ******** closing message *********
        
        programInfo.printClosingMessage();
        programInfo.printClosingMessage(fout);
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
}  // end class

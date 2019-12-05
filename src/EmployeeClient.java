/********************************************************************
 * Programmer:	Amy Mann
 * Class:       CS30S
 *
 * Assignment:  December Exam
 *
 * Description: exploring some OOP basics. Create a Circle class to calculate 
 *              the dimensions of a Circle object
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
        
        double wage = 0.00;
        int hours = 0;
        
        Employee employee[] = new Employee[MAXSIZE];
        
        int arrayLength = 0;          // the length of the employee array
    	
        int additionalEmployeeHours = 0; // the hours worked by the additional employee
        double additionalEmployeeWage = 0;  // the wage worked by the additional employee        
    // ***** create objects *******
    
        // additionalEmployee will be created using default constrocotr and using setter methods
        
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
	    	
    // ************************ get input **********************
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";	
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
*/
        // read a line of data from the external text file

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

        additionalEmployeeHours = 50;
        additionalEmployeeWage = 12.5;
        
        Employee additionalEmployee = new Employee();
        
        additionalEmployee.setHours(additionalEmployeeHours);  // sets the wage of the additional employee
        additionalEmployee.setWage(additionalEmployeeWage);    // sets the hours of the additional employee
        
    // ************************ print output ****************************

        /*System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        //System.out.println(circle2.radius);
        
        System.out.println("Circle 1 Area = " + circle1.getArea());
        System.out.println("Circle 2 Area = " + circle2.getArea() + nl + nl);
        
        circle1.setRadius(2);
        circle2.setRadius(5.78);
        System.out.println("Circle 1 Area = " + circle1.getArea());
        System.out.println("Circle 2 Area = " + circle2.getArea() + nl + nl); */
        
        for(int i = 0; i < arrayLength; i++){
            System.out.println(employee[i].toString());
        } // end of for loop for the employees using the intialized constructor
        
        System.out.println(additionalEmployee.toString());

    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class

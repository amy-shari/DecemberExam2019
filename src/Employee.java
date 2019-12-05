/********************************************************************
 * Programmer:	Amy Mann
 * Class:       CS30S
 *
 * Assignment:  December Exam 2019
 *
 * Description: Employee class, will determine the wage, hours, ID, regular pay,
 *              overtime pay, and gross pay of an employee object
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
        public static int nextID = 1000;
    
    //*** Instance Variables ***
    
        private int id = 0;                 // the local id variable
        private double wage = 0.00;         // the wage of the employee
        private int hours = 0;              // the hours worked by employee
        
        private final int REGULARHOURS = 40; // the amount of reg hours before overtime kicks in
        private final int OVERTIMEHOURS= 41; // the minimum amount of hours for overtime pay
        
        private final double OVERTIMEPAYINCREASE = 1.5; // the amount employees are paid for overtime work
        
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
        
    /*****************************************
    * Description:  default constructor, creates an employee with a unique id 
    * 
    * ****************************************/
        public Employee(){
            
        // use the class variable nextID to assign a unique id to this object
        // after the id has been assigned increment nextID so that the next
        // object created gets a unique id as well
        this.id = nextID++;
        this.wage = 0;
        this.hours = 0;
        } // end default constructor
        
    /*****************************************
    * Description:  initialized constructor, create an employee with a specific 
    * wage and hours
    * 
    * Interface:
    * 
    * @param        wage : double, amount earned per hour
    * @param        hours : int, amount of hours worked
    * ****************************************/
        public Employee(double wage, int hours){
            this.id = nextID++;
            this.wage = wage;
            this.hours = hours;
        } // end initialized constructor
    
    
    //*** Getters ***
        
    /*****************************************
    * Description:  gets the id of the employee
    * 
    * Interface:
    * 
    * @return       id : int, the unique id of the circle
    * ****************************************/
        public int getId(){
            return this.id;
        } // end getId
        
   /*****************************************
    * Description:  get the pay (encapsulates getOvertimePay and getRegularPay)
    * 
    * Interface:
    *        
    * @return   pay : double 
    * ****************************************/
        public double getGrossPay(){
            double grossPay = 0.0;
            grossPay = this.getRegularPay() + this.getOvertimePay();
            
            
            return grossPay;
        } // end getPay 
        
    /*****************************************
    * Description:  get the overtime pay 
    * 
    * Interface:
    *        
    *
    * @return  overtimePay : double
    ****************************************/
        public double getOvertimePay(){
            double overtimePay = 0;             // the double for the overtime pay
            int n = this.hours;                  // creates int n which is stores the original value of overtime pay
            this.hours = this.hours / OVERTIMEHOURS; // if hours is over 40, it makes this.hours 1, if not this.hours is 0
            this.hours = this.hours * n;            // this returns hours to original value if they are over 40
            this.hours = this.hours % REGULARHOURS; // this finds the overtime hours
            overtimePay = this.wage * this.hours * OVERTIMEPAYINCREASE; // calculates the overtime pay
        return overtimePay;    
        } // end getPay     

    /*****************************************
    * Description:  get the regular pay 
    * 
    * Interface:
    *        
    *
    * @return  overtimePay : double
    ****************************************/
        public double getRegularPay(){
            double regularPay = 0.00;
            if(hours <= REGULARHOURS){
                regularPay = this.wage * this.hours;
            }
            else{
                regularPay = this.wage * REGULARHOURS;
            }
            regularPay = this.wage * this.hours;
        return regularPay;    
        } // end getPay    
        
    /*****************************************
    * Description:  print circle details
    * 
    * Interface:
    * 
    * @return       s: String, circle dimensions
    * ****************************************/
        public String toString(){
            String s = "";
         
          s = String.format("%-10s %10s %s", "ID:", this.id, "\n");
          s += String.format("%-10s %10d %s", "Hours:", this.hours, "\n");
          s += String.format("%-10s %10.5f %s", "Wage:", this.wage, "\n");
          s += String.format("%-10s %10.5f %s", "Regular Pay:", this.getRegularPay(), "\n");
          s += String.format("%-10s %10.5f %s", "Overtime Pay:", this.getOvertimePay(), "\n");
          s += String.format("%-10s %10.5f %s", "Gross Pay:", this.getGrossPay(), "\n");
          
            return s;
        } // end toString overloaded
        
    //*** Setters ***
        
    /*****************************************
    * Description:  set the value of hours
    * 
    * Interface:
    * 
    * @param        hours: int, n number of hours worked by employee
    * ****************************************/
        public void setHours(int hours){
            this.hours = hours;
        } // end setRadius
        
    /*****************************************
    * Description:  set the value of wage
    * 
    * Interface:
    * 
    * @param        wage: double, n wage of the employee
    * ****************************************/
        public void setWage(double wage){
            this.wage = wage;
        } // end setRadius
    
} // end of public class

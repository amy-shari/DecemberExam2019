/********************************************************************
 * Programmer:	Amy Mann
 * Class:       CS30S
 *
 * Assignment:  Circle object example
 *
 * Description: Circle class, will calculate the area, diameter, and circumference
 *              of a circle object
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
        public static int nextID = 1000;
    
    //*** Instance Variables ***
    
        private int id = 0;
        private double wage = 0.00;
        private int hours = 0;
        
        private final int REGULARHOURS = 40;
        private final double OVERTIMEPAYINCREASE = 1.5;
        
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
            double overtimePay = 0;
            this.hours = this.hours - REGULARHOURS;
            overtimePay = this.wage * this.hours * OVERTIMEPAYINCREASE;
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
         
          s = String.format("%-10s %10.5f %s", "ID:", this.id, "\n");
          s += String.format("%-10s %10.5f %s", "Hours:", this.hours, "\n");
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

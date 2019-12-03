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
        private double getOvertimePay;
        final int REGULARHOURS = 40;
        
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
    * Description:  default constructor, create a circle object with radius = 0
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
    * Description:  initialized constructor, create a circle with a radius of 
    *               length r
    * 
    * Interface:
    * 
    * @param        wage : double, amount earned per hour
    * @param        hours : int, amount of hours worked
    * ****************************************/
        public Employee(double wage, int hours){
            this.id = nextID++;
            this.wage = 0;
            this.hours = 0;
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
        public double getPay(){
            double pay = 0.0;
            if(this.hours >= REGULARHOURS){
                pay = regularPay;
            }
           else{
            pay = overtimePay;
                
            }
            
            
            return pay;
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
            overtimePay = this.wage * this.hours * 1.5;
        return overtimePay;    
        } // end getPay     

    /*****************************************
    * Description:  get the overtime pay 
    * 
    * Interface:
    *        
    *
    * @return  overtimePay : double
    ****************************************/
        public double getRegularPay(){
            double overtimePay = 0;
            this.hours = this.hours - 40;
            overtimePay = this.wage * this.hours * 1.5;
        return overtimePay;    
        } // end getPay    
        
    /*****************************************
    * Description:  get the area of the circle object
    * 
    * Interface:
    * 
    * @return       area: double, the area of the circle object
    * ****************************************/ 
        public double getArea(){
            return Math.pow(this.radius, 2) * this.PI;
        } // end getarea
        
    /*****************************************
    * Description:  get the diameter of the circle object
    * 
    * Interface:
    * 
    * @return       d; double, diameter of the circle object
    * ****************************************/
        public double getDiameter(){
            return this.radius * 2;
        } // end getDiameter
        
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
          s += String.format("%-10s %10.5f %s", "Radius:", this.radius, "\n");
          s += String.format("%-10s %10.5f %s", "Area:", this.getArea(), "\n");
          s += String.format("%-10s %10.5f %s", "Diameter:", this.getDiameter(), "\n");
          
            return s;
        } // end toString overloaded
        
    //*** Setters ***
        
    /*****************************************
    * Description:  changes the value of radius
    * 
    * Interface:
    * 
    * @param        r: double, new radius of circle object
    * ****************************************/
        public void setRadius(double r){
            this.radius = r;
        } // end setRadius
    
} // end of public class

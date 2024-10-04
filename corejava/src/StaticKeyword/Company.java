package StaticKeyword;

class Company {
   
    private static int employeeCount = 0;
    private static int totalSal = 0;

   
    private String name;
    private int id;
    private static int sal;

    
    public Company(String name,int sal) {
        this.name = name;
        this.sal= sal;
        this.id = ++employeeCount;  
    }

    
    public static int getTotalEmployees() {
    	
        return employeeCount;
    }
    
    public static int getTotalSalary() {
    	
    	totalSal+=sal;
    	
        return totalSal;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    
    public static void displayCompanyInfo() {
        System.out.println("Company Name: XYZ Corp");
        System.out.println("Total Employees: " + getTotalEmployees());
        System.out.println("Total Salary for all Employee ="+getTotalSalary());
        
    }

    public static void main(String[] args) {
        
        Company emp1 = new Company("Alice",2000);
        Company emp2 = new Company("Bob",10000);
        Company emp3 = new Company("Charlie",5000);

       
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

       
        Company.displayCompanyInfo();
    }
}


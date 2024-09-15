public class Company {
    private String CompanyName;
    private String CompanyLocation;
    public Company(String company_name, String company_location){
        this.CompanyName = company_name;
        this.CompanyLocation = company_location;
    }
    public class Employee{
        private String empName;
        private String empEmail;

        public Employee(String emp_name,String emp_email){
            this.empName = emp_name;
            this.empEmail = emp_email;
        }

        public void displayEmployee(){
            System.out.println("Name of the employee: "+this.empName);
            System.out.println("Email of the employee: "+this.empEmail);
        }
    }


    public void displayCompany(){
        System.out.println("Company Name: "+CompanyName);
        System.out.println("Company Address: "+CompanyLocation);

        Employee emp1 = new Employee("Rohit Dev", "rohit.dev.india@gmail.com");
        Employee emp2 = new Employee("Khushi kandari", "khushi.pahadan@gmail.com");

        emp1.displayEmployee();
        emp2.displayEmployee();
    }

    public static void main(String args[]){
        Company comp = new Company("Onlinxp Pvt Ltd", "Sainik Farm, Saket, new Delhi, india");
        comp.displayCompany();
    }
}

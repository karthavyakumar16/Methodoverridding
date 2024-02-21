package Employee;

public class EmployTest {

    public static void main(String[] args) {
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.name="karthavya";
        employeeDetails.fatherName="kumar";
        employeeDetails.moblieNo="9652295359";
        employeeDetails.employId="12345";
        System.out.println(employeeDetails);
        CompanyDetails companyDetails=new CompanyDetails();
        companyDetails.companyName="neoteric";
        companyDetails.address="kphb";
        companyDetails.pincode="54321";
        System.out.println(companyDetails);
    }

}

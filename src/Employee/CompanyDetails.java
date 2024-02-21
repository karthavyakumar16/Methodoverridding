package Employee;

public class CompanyDetails {
    public String companyName;
    public String address;
    public String pincode;

    @Override
    public String toString() {
        return "CompanyDetails{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

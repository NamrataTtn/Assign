public class Bank {

    String branch;
    float roi;
    int totalEmp;
    Address address;

    Bank(){}

    Bank(String branch, float roi, int totalEmp, Address address) {
        this.branch = branch;
        this.roi = roi;
        this.totalEmp = totalEmp;
        this.address = address;
    }

    class Address
    {
        String city;
        String state;
        String streetName;


        public Address(String city, String state, String streetName) {
            this.city = city;
            this.state = state;
            this.streetName = streetName;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }


    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getRoi() {
        return roi;
    }

    public void setRoi(float roi) {
        this.roi = roi;
    }

    public int getTotalEmp() {
        return totalEmp;
    }

    public void setTotalEmp(int totalEmp) {
        this.totalEmp = totalEmp;
    }

    void getDeatils(){
        System.out.println("Branch : "+getBranch());
        System.out.println("Rate Of Interest : "+getRoi());
        System.out.println("Total Employees : "+getTotalEmp());
        System.out.println("City : "+address.getCity());
        System.out.println("State : "+address.getState());
        System.out.println("Street Name : "+address.getStreetName());
    }

}

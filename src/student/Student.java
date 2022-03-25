package student;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String address;
    private String state;
    private String zipcode;
    private float percentage;

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String  zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return
                id + ", " + firstName + ", " + lastName + ", " + mobileNo + ", " + address + ", " + state + ", " + zipcode + ", " + percentage+"%";
    }
}

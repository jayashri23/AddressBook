package addressbook;

public class DisplayPersonDetails {
    public String FirstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public int phoneNumber;

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
       this.FirstName = FirstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
       this.address = address;
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
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
       this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        String str = "\n Firstname=" +FirstName+   "\n lastname="+lastName+    "\n Address="+address+   "\n State=" +
                ""+state+   "\n City=" +city+
                "\n PhoneNumber="+phoneNumber  ;return str;
         }
        public static void main(String[] args) {

            System.out.println("---------Person Address Detail-----------");

            DisplayPersonDetails emp = new DisplayPersonDetails();
            emp.setFirstName("Jayashri");
            emp.setLastName("Vadde");
            emp.setAddress("Mumbai");
            emp.setState("Maharashtra");
            emp.setCity("Sangli");
            emp.setPhoneNumber(987654321);
            System.out.println(emp.toString());
        }
    }

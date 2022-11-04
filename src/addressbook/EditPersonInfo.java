package addressbook;

import java.util.*;

public class EditPersonInfo {
    public String name;
    public String address;
    public String city;
    public String state;
    public int phoneNumber;
    EditPersonInfo(String name, String address, String state, String city, int phoneNumber){

        this.name=name;
        this.address=address;
        this.state=state;
        this.city=city;
        this.phoneNumber=phoneNumber;
    }

    public EditPersonInfo() {
        this.name=name;
        this.address=address;
        this.state=state;
        this.city=city;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "\n name=" + name + "\n Address=" + address + "\n State=" +
                "" + state + "\n City=" + city +
                "\n PhoneNumber=" + phoneNumber;
    }
    public static void main(String[] args) {
        List<EditPersonInfo> c = new ArrayList<EditPersonInfo>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Edit");
            System.out.print("Enter your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter name:");
                    String name = s1.nextLine();
                    System.out.print("Enter Address:");
                    String address = s1.nextLine();
                    System.out.print("Enter State:");
                    String state = s1.nextLine();
                    System.out.print("Enter city:");
                    String city = s1.nextLine();
                    System.out.print("Enter PhoneNumber:");
                    int phoneNumber = s.nextInt();
                    c.add(new EditPersonInfo (name,address,state,city,phoneNumber));
                    break;
                case 2:
                    System.out.println(".......................");
                    Iterator<EditPersonInfo> i = c.iterator();
                    while (i.hasNext()) {
                        EditPersonInfo e = i.next();
                        System.out.println(e);
                    }
                    break;
                case 3:
                    Boolean found=false;
                    System.out.print("Enter Person Name to Edit details:");
                    name=s1.nextLine();
                    System.out.println("....................");
                    ListIterator<EditPersonInfo> li=c.listIterator();
                    while (li.hasNext()){
                        EditPersonInfo e=li.next();
                        if(e.getName() == name){
                            System.out.print("Enter new address");
                            address=s.nextLine();
                            System.out.print("Enter new state:");
                            state=s.nextLine();
                            System.out.print("Enter new city:");
                            city=s.nextLine();
                            System.out.print("Enter new PhoneNumber");
                            phoneNumber=s1.nextInt();
                            li.set(new EditPersonInfo(name,address,state,city,phoneNumber));
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    }else {
                        System.out.println("Record updated Successfully");
                    }
                    System.out.println(".............");
                    break;
                }
        } while (ch != 0);
    }
}

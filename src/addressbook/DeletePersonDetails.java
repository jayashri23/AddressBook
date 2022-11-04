package addressbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class DeletePersonDetails {
    public String name;
    public String address;
    public String city;
    public String state;
    public int phoneNumber;

    DeletePersonDetails(String name, String address, String state, String city, int phoneNumber) {

        this.name = name;
        this.address = address;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
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

        Collection<DeletePersonDetails> c = new ArrayList<DeletePersonDetails>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Delete");
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
                    c.add(new DeletePersonDetails(name, address, state, city, phoneNumber));
                    break;
                case 2:
                    System.out.println(".......................");
                    Iterator<DeletePersonDetails> i = c.iterator();
                    while (i.hasNext()) {
                        DeletePersonDetails e = i.next();
                        System.out.println(e);
                    }
                    break;
                case 3:
                    Boolean found = false;
                    System.out.print("Enter Person Name to Delete:");
                    name = s1.nextLine();
                    System.out.println("..........................");
                    i=c.iterator();
                    while (i.hasNext()){
                       DeletePersonDetails e=i.next();
                       if(e.getName() == name){
                           i.remove();
                            found=true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record Deleted Successfully");
                    }
                    System.out.println(".............");
                    break;
                }
           } while (ch != 0);
       }
    }


























package addressbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class AddPersonDetail {

    public String name;
    public String address;
    public String city;
    public String state;
    public int phoneNumber;
    AddPersonDetail(String name, String address, String state, String city, int phoneNumber){

        this.name=name;
        this.address=address;
        this.state=state;
        this.city=city;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setLastName(String name) {
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
        return  "\n name=" +name+    "\n Address="+address+   "\n State=" +
                ""+state+   "\n City=" +city+
                "\n PhoneNumber="+phoneNumber  ;
    }

    public static void main(String [] args) {
        Collection<AddPersonDetail>c= new ArrayList<AddPersonDetail>();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();

            switch (ch) {
                case 1 : {
                    System.out.print("Enter Name:");
                    String name = sc1.nextLine();
                    System.out.print("Enter Address:");
                    String add = sc1.nextLine();
                    System.out.print("Enter State:");
                    String state = sc1.nextLine();
                    System.out.print("Enter City:");
                    String city = sc1.nextLine();
                    System.out.print("Enter PhoneNumber:");
                    int phoneNumber = sc.nextInt();

                    c.add(new AddPersonDetail(name, add, state, city, phoneNumber));
                    break;
                }
                case 2 : System.out.print("....................");
                    Iterator<AddPersonDetail> i=c.iterator();
                    while (i.hasNext()){
                        AddPersonDetail e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("......................");
                break;
            }
        } while (ch != 0);
    }
}

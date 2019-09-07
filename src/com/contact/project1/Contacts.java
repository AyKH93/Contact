package com.contact.project1;
import java.util.Scanner;
public class Contacts {

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the Person");
        String name= sc.nextLine();
        System.out.println("Enter the Surname of the Person");
        String surname= sc.nextLine();
        System.out.println("Enter the Number of the Person");
        String number=sc.nextLine();

        Contact contact1= new Contact(name,surname,number);
        System.out.println(contact1);
    }
}

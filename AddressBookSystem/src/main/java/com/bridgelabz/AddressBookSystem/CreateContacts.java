package com.bridgelabz.AddressBookSystem;

import java.io.File;
import java.util.Scanner;

class AddressBook 
{
    // class variable
    static final Scanner scanner = new Scanner(System.in);

    // instance method
    void createNewContact() throws Exception {
        System.out.print("Enter name of the contact:");
        String contactName = scanner.nextLine();
        File file = new File(contactName);
        if (file.exists()) 
        {
            System.out.println("contact " + file.getName() + " already exists!");
        } 
        else 
        {
            if (file.createNewFile()) 
            {
                System.out.println("new contact " + file.getName() + " is created successfully");
            } 
            else 
            {
                System.out.println("file creation failed!");
            }
        }

    }

	public void editContactname() {
		// TODO Auto-generated method stub
		
	}

	public void editContactInfo() {
		// TODO Auto-generated method stub
		
	}

	public void viewContactInfo() {
		// TODO Auto-generated method stub
		
	}

	public void displayAllContacts() {
		// TODO Auto-generated method stub
		
	}

	public void fillContactDetails() {
		// TODO Auto-generated method stub
		
	}

	public void deleteContact() {
		// TODO Auto-generated method stub
		
	}
}

public class CreateContacts {
    // class variable
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        AddressBook addressBook = new AddressBook();
        while (true) 
        {
            System.out.println("-----------------------------");
            System.out.println("1.create a new contact");
            System.out.println("2.exit");
            System.out.print("enter option:");
            int option = scanner.nextInt();
            switch (option) 
            {
                case 1:
                    addressBook.createNewContact();
                    break;
                case 2:
                    System.out.println("exiting....");
                    System.exit(0);
                default:
                    System.out.println("please enter the correct choice");
                    break;
            }

        }

    }
}
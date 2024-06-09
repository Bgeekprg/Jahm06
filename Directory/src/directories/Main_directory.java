package directories;
import java.util.*;
//Write a program to create a directory that contains the following information.
//(a) Name of a person
//(b) Address
//(c) Telephone Number (if available with STD code)
//(d) Mobile Number (if available)
//(e) Head of the family
//(f) Unique ID No.
//The program will support the following menu based activities:
//(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of two or more persons can be same if and only if the head of family is same)
//(b) Edit an entry (Must be identified by only the Unique ID number)
//(c) Search by keyword (Any keyword may not be complete; even if the keyword matches partially with any field, the corresponding information must be displayed)
public class Main_directory {
	
	int choice;
	static int uid=0;
	
	
	public void menu()
	{
		System.out.println("(1) Create a database entry "); 
		System.out.println("(2) Edit an entry ");
		//System.out.println("(3) Search by keyword ");
		System.out.println("(3) exit ");
		System.out.print("Enter ur choice =>");
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Directory> dir=new ArrayList<Directory>();
		Main_directory obj= new Main_directory();
		Scanner sc = new Scanner(System.in);
		//int ar[] = new int[10];
		String name , address , telephone , mobile , headoffamily;
		do {
		obj.menu();
		obj.choice=sc.nextInt();
		switch(obj.choice)
		{
		case 1:
			System.out.println("Enter name => "); name=sc.next();
			System.out.println("Enter address => "); address=sc.next();
			System.out.println("Enter telephone => "); telephone=sc.next();
			System.out.println("Enter mobile => "); mobile=sc.next();
			System.out.println("Enter headoffamily => "); headoffamily=sc.next();
			
			Directory dobj= new Directory(++uid,name,address,telephone,mobile,headoffamily);
			System.out.println("Entry Added successfully");
			dir.add(dobj);
			break;
		case 2:
//			for(Directory i:dir)
//			{	
//				System.out.println(i);
//			}
			  System.out.print("Enter Unique ID to edit => ");
		        int id = sc.nextInt();
		        Directory entry = null ;
		        for (Directory d : dir) {
		            if (d.getUniqueId() == id) {
		                entry = d;
		                break;
		            }
		        }
		        if (entry != null) {
		            System.out.print("Enter new name => ");
		            name = sc.next();
		            System.out.print("Enter new address => ");
		            address = sc.next();
		            System.out.print("Enter new telephone => ");
		            telephone = sc.next();
		            System.out.print("Enter new mobile => ");
		            mobile = sc.next();
		            System.out.print("Enter new head of family => ");
		            headoffamily = sc.next();
		            
		            entry.setName(name);
		            entry.setAddress(address);
		            entry.setTelephoneNumber(telephone);
		            entry.setMobileNumber(mobile);
		            entry.setHeadOfFamily(headoffamily);
		            
		            System.out.println("Entry updated successfully!");
		        } else {
		            System.out.println("Entry not found!");
		        }
			
			
			
			break;
		}
		}while(obj.choice!=3);
		System.out.println(dir+"\n");
		
	}

}

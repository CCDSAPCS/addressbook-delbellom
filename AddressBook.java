import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

public void addContact(Contact c){
	friends[numfriends] = c;
	numFriends++;
}

public void printContacts(){
	for (int i=0; i<numfriends;i++)
		friends[i].printContact();
}
//	for (contact cc: AddressBook)
//		friends[cc].printContact();
// }

public void int numContacts(){
	return numfriends;
}
	
public int haveContact(String s){
	//interate through list of friends i=0 to numfriends
	if (int i=0; i<numfriends; i++)
		if (friends[i].getname().equals(s)) {
			return i; }
	else {
	return -1; }
}
 
	
public static void main(){
	System.out.println("1. Add new contact.");
	System.out.println("2. Deletea a contact.");
	System.out.println("3. Print out the number of contacts you have.");
	System.out.println("4. Print out information of contacts.");
	System.out.println("5. Exit.");
	System.out.println("Enter menu choice: ");
}
public static void main(String[] args){
		 Scanner sc = new Scanner(System.in)
		 menu();
	// if choice == (  (STILL WORKING, not finished)
		 int choice = sc.nextInt();
 }
	
}


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
	
public void haveContact(String s){
	//interate through list of friends i=0 to numfriends
	if (friends[i].getname()

/**
 * @see from 68 Chapter 2 Lists and the Collections Framework
 */

/**
 * @author hayde
 *
 */

import java.util.*;
public class DirectoryEntry {

	String name;
	 String number;
	 
	/**
	 * @param name
	 * @param number
	 */
	public DirectoryEntry(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	/**
	 * 
	 */
	 
	private static List<DirectoryEntry> theDirectory =	 new ArrayList<>();
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}


	/**
	 * @return the theDirectory
	 */
	public static List<DirectoryEntry> getTheDirectory() {
		return theDirectory;
	}


	/**
	 * @param theDirectory the theDirectory to set
	 */
	public static void setTheDirectory(List<DirectoryEntry> theDirectory) {
		DirectoryEntry.theDirectory = theDirectory;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DirectoryEntry)) {
			return false;
		}
		DirectoryEntry other = (DirectoryEntry) obj;
//		return Objects.equals(name, other.name) && Objects.equals(number, other.number);
		return Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "DirectoryEntry [name=" + name + ", number=" + number + "]";
	}

	/** Add an entry to theDirectory or change an existing entry.
	 @param aName The name of the person being added or changed
	 @param newNumber The new number to be assigned
	 @return The old number, or if a new entry, null
	 */
	public String addOrChangeEntry(String aName, String newNumber) {
		
		return "";
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		theDirectory.add(new DirectoryEntry("Phil Smith", "555‐549‐1234"));
		theDirectory.add(new DirectoryEntry("Ben Smith", "555‐549‐1236"));
		theDirectory.add(new DirectoryEntry("Jane Smith", "555‐549‐1234"));
//		System.out.println(theDirectory.get(0).toString());
		String janeName = "Jane Smith";
		String janeNumber = "555‐549‐1234";
		
//		int indexJane = -1;
		
		// check entry above for the .equals, 
//		as it is set as stringName only and not stringName&&stringNumber
		int indexJane = theDirectory.indexOf(new DirectoryEntry(janeName,janeNumber)); 
		
		
		System.out.println("Index of Jane: "+indexJane);
		if(indexJane == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println(theDirectory.get(indexJane).toString());
		}
		
	}

}

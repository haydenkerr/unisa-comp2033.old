
/**
 * @author hayde
 *
 */

// abstract class created for computer

//The customer can select the processor speed, the amount of memory, and the size of the disk drive. 

//The customer can also choose a CD drive (CD ROM, CD‐RW), a DVD drive, or both. 


public abstract class Computer {
		protected String name;
		protected int speed;
		protected int memory;
		protected int storageSize;
		protected boolean cdDrive;
		protected boolean dvdDrive;
		// TODO Auto-generated constructor stub
	
	
	public Computer(String name, int speed, int memory, int storageSize, boolean cdDrive,  boolean dvdDrive) {
		this.name = name;
		this.speed = speed;
		this.memory = memory;
		this.storageSize = storageSize;
		this.cdDrive = cdDrive;
		this.dvdDrive = dvdDrive;

	}
	// abstract methods
	public abstract void getComputerInfo();
}





		












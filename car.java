package week1day2;

public class car {
	public void applybreak() {
		System.out.println("Applybreak");
	}
	public void applyGear() {
	System.out.println("Apply Gear");
}
public void switchonAc() {
System.out.println("Switch on AC");
}
public void applyAccelerate() {
System.out.println("Apply Accelerate");
}
public static void main(String[] args) {
car actions = new car ();
actions.applybreak();
actions.applyGear();
actions.switchonAc();
actions.applyAccelerate();		
}
		
}

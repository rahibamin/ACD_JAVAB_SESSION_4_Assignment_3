package Session4.Assignment3;

public class Tester extends thisOverride {

	public int getLuckyNumber(int x) {
		this.luckyNumber = x;
		return luckyNumber;
		
	}
	
	public String getName(String B) {
		this.Name = B;
		return Name;
		
	}

	
	public static void main(String[] args) {
		Tester l = new Tester();
		
		System.out.println("My name is " + l.getName("Rahib"));
		System.out.println("My lucky Number is " + l.getLuckyNumber(5));
	}

}

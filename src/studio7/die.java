package studio7;

public class die {
private int n;

public die (int n) {
	n= this.n;
}
public double randomInteger() {
	return Math.random()*this.n + 1;
}
public static void main(String[] args) {
	die die1 = new die(7);
	System.out.println(die1.randomInteger());
}
}


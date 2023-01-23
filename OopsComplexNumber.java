/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	   private int real;
	private int imag;
	
	public ComplexNumbers(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public int getImag() {
		return imag;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void plus(ComplexNumbers c) {
		int real=this.real + c.real;
		int imag=this.imag+c.imag;
		this.real=real;
		this.imag=imag;
	}
	public void multiply(ComplexNumbers c) {
		int real= this.real * c.real - this.imag * c.imag;
		int imag= this.real * c.imag + c.real * this.imag;
		this.real=real;
		this.imag=imag;
	}
	public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2) {
		int real=c1.real + c2.real;
		int imag=c1.imag+c2.imag;
		return new ComplexNumbers(real, imag);
	}
	public static ComplexNumbers multiply(ComplexNumbers c1,ComplexNumbers c2) {
		int real= c1.real * c2.real - c1.imag * c2.imag;
		int imag= c1.real * c2.imag + c2.real * c1.imag;
		return new ComplexNumbers(real, imag);
	}
	public void print() {
		System.out.println(this.real + " + i"+ this.imag);
	}
	public ComplexNumbers conjugate() {
		int imag=-this.imag;
		return new ComplexNumbers(this.real, imag);
	}
	
}

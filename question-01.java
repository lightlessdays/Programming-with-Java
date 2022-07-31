class Complex {
    private int x;
    private int y;

    /**
     * Parameterized Constructor of Complex class
     *
     * @param real      Real Part
     * @param imaginary Imaginary Part
     */
    public Complex(int real, int imaginary) {
        this.x = real;
        this.y = imaginary;
    }

    /**
     * Add two Complex Objects
     *
     * @param o Complex Object
     * @return Complex Object
     */
    public Complex add(Complex o) {
        return new Complex(
                this.x + o.x,
                this.y + o.y);
    }

    /**
     * Multiply two Complex Objects
     *
     * @param o Complex Object
     * @return Complex Object
     */
    public Complex multiply(Complex o) {
        return new Complex(
                this.x * o.x - this.y * o.y,
                this.x * o.y + o.x * this.y);
    }

    /**
     * Type Conversion to String
     *
     * @return String Representation
     */
    @Override
    public String toString() {
        return x + " + i " + y;
    }
}

/**** Main.java ****/
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        System.out.println("Complex 1: " + c1);
        System.out.println("Complex 2: " + c2);
        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Product: " + c1.multiply(c2));
    }
}

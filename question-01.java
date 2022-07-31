import java.util.Scanner;

public class Main{
    static Complex addNumbers(Complex number1, Complex number2){
        Complex number3=new Complex();
        number3.x=number1.x+number2.x;
        number3.y=number1.x+number2.y;
        return number3;
    }

    static Complex multiplyNumbers(Complex number1,Complex number2){
        Complex number3=new Complex();
        int a=number1.x;
        int b=number1.y;
        int c=number2.x;
        int d=number2.y;
        number3.x=((a*c)-(b*d));
        number3.y=((a*d)+(b*c));
        return number3;
    }

    static String toString(Complex number){
        return new String(number.x+"+"+number.y+"i");
    }

    public static void main(String[] args) {
        Complex number1=new Complex();
        Complex number2=new Complex();
        Scanner input=new Scanner(System.in);
        System.out.print("First number's real number:");
        int x=input.nextInt();
        System.out.print("First number's imaginary number:");
        int y=input.nextInt();
        number1.x=x;
        number1.y=y;
        System.out.print("Second number's real number:");
        x=input.nextInt();
        number2.x=x;
        System.out.print("Second number's complex number:");
        y=input.nextInt();
        number2.y=y;
        System.out.println("The sum of the numbers is "+toString(addNumbers(number1,number2)));
        System.out.println("The product of the numbers is "+toString(multiplyNumbers(number1,number2)));
        input.close();
    }
    
}

class Complex{
    int x;
    int y;
}

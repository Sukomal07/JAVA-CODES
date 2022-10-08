public class Q1 {
    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex a = Complex.add(c, d);
        Complex k = Complex.diff(c, d);
        Complex p = Complex.product(c, d);
        a.printComplex();
        k.printComplex();
        p.printComplex();
        
    }
}
class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real=r;
        imag=i;
    }
    public static Complex add(Complex a , Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex((a.real*b.real), (a.imag*b.imag));
    }

    public void printComplex(){
        if(real ==0 && imag != 0){
            System.out.println(imag+ "i");
        }
        else if(imag ==0 && real!=0){
            System.out.println(real);
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the 1st numerator ----> ");
    int n1 = input.nextInt();
    System.out.println("Enter the 1st denominator ----> ");
    int d1 = input.nextInt();
    System.out.println("Enter the 2nd numerator ----> ");
    int n2 = input.nextInt();
    System.out.println("Enter the 2nd denominator ----> ");
    int d2 = input.nextInt();
    Rational f1 = new Rational(n1, d1);
    Rational f2 = new Rational(n2, d2);

    Rational f1m = f1;
    Rational f2m = f2;

    Rational f1d = f1;
    Rational f2d = f2;

    Rational f1a = f1;
    Rational f2a = f2;

    Rational f1s = f1;
    Rational f2s = f2;

    f1m.multiply(f2m);
    f1m.getGCF();
    f1m.simplified();
    System.out.println(f1 + " * " + f2 + " = "+ f1m);

    f1d.divide(f2d);
    f1d.getGCF();
    f1d.simplified();
    System.out.println(f1 + " / " + f2 + " = "+ f1d);

    f1a.add(f2a);
    f1a.getGCF();
    f1a.simplified();
    System.out.println(f1 + " + " + f2 + " = "+ f1a);

    f1s.subtract(f2s);
    f1s.getGCF();
    f1s.simplified();
    System.out.println(f1 + " - " + f2 + " = "+ f1s);
  }
}
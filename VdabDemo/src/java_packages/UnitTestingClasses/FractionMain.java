package java_packages.UnitTestingClasses;

public class FractionMain {

    public static void main(String[] args) {
        Fraction a = new Fraction(2,4);
        Fraction b = new Fraction (6,3);

        a.maal(b);

        System.out.println(Fraction.greatestCommonFactor(8,16));
    }
}

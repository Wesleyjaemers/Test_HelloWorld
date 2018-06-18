package java_packages.UnitTestingClasses;

import static java.lang.Math.abs;

public class Fraction {

    private int teller, noemer;
    private int res;

    public int getTeller() {
        return teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public int getRes() {
        return res;
    }


    public Fraction(int teller, int noemer) {
        if(teller > 0 && noemer > 0){
        this.teller = teller;
        this.noemer = noemer;
        }
    }


    public Fraction maal (Fraction b){
         return new Fraction (this.teller*b.teller, this.noemer*b.noemer);
    }

    public void vereenvoudig(){

    }

    public static int greatestCommonFactor(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }
        a = abs(a);
        b = abs(b);
        if(a < b) {
            return greatestCommonFactor(b, a);
        }

        int delta = a % b;
        if(delta == 0) {
            return b;
        } else {
            return greatestCommonFactor(b, delta);
        }
    }
}

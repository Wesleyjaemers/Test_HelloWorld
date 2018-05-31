package java_packages;

public class Pi {
    public static void main(String[] args) {

        int limit = 1000000000;
        int teken = 1;
        double som = 0;

        for(int i=1;i<=limit;i+=2){
            double term=(1.0/i)*teken;
            //System.out.println(term);
            teken *=-1;
            som += term;

        }
        double pi = 4*som;
        System.out.println("Resultaat Pi= "+ pi);
    }
}

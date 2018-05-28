public class Vierkant {
    public static void main(String[] args) {

        /*int k = 1;
        int j = 100;

        for (int i=1; i<=j; i++){
            System.out.print(i + " ");

            if  (i==k*10){
                System.out.println();
                k++;

            }

            } */

        int getal = 1;

        while (getal < 101) {
            if ((getal % 10) == 0) {
                System.out.println(getal + " ");
            }
            else{
                System.out.print(getal + " ");
            }
            getal = getal +1;
        }

        }
    }

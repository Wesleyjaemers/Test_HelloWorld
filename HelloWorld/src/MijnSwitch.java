public class MijnSwitch {
    public static void main(String[] args) {

        /* int maand = 2;

        switch (maand){
            case 1:
                System.out.println("januari");

            case 2:
                System.out.println("februari");
                break;

            default:
                System.out.println("ongeldige waarde");
        }*/

        String maand = "nov";

        switch (maand){

            case "sep":
                System.out.println("klein");
                break;

            case "okt":
                System.out.println("lekker");
                break;

            case "jan":
            case "feb":
            case "mrt":
            case "apr":
                System.out.println("buiten seizoen");
                break;

            default:
                System.out.println("NEE");

        }
    }
}

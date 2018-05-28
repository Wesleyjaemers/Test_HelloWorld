import java.sql.SQLOutput;

public class CookieCounter {

    public static void main(String[] args) {
        double calPerServ = 300;
        int servPerBag = 10;
        int cookiesPerBag = 40;
        int cookiesPerServ = cookiesPerBag / servPerBag;
        double calPerCookie = calPerServ / cookiesPerServ;
        double cookies = 35;
        double aantalCal = cookies * calPerCookie;

        System.out.println("het aantal caloriën bedraagt: " + aantalCal);
    }


}

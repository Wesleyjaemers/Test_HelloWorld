package java_packages.Theorie.Enumeration;

import java.util.Scanner;

public class WeatherMain {

    public static void main(String[] args) {

        String month;

        Scanner s = new Scanner (System.in);
        System.out.println("Geef de maand op");
        month = s.next().toUpperCase();

            System.out.println("De gemiddelde statistieken voor " + month + " zijn: \n" +
                    "Temperatuur: " + WeatherEnum.valueOf(month).getTemperature() + "° \n" +
                    "Regenval: " + WeatherEnum.valueOf(month).getRainfall() + "mm \n" +
                    "Uren zon: " + WeatherEnum.valueOf(month).getSunshineHours() + " uren");

    }




}

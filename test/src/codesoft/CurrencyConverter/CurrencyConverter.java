package codesoft.CurrencyConverter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class CurrencyConverter {
	
	

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Please enter Country Code from which you want to change");
        String fromCountry = scanner.nextLine().toUpperCase();

    	System.out.println("Please enter Country Code to which you want to change");
        String toCountry = scanner.nextLine().toUpperCase();

    	System.out.println("Please enter Amount");
        int amount = scanner.nextInt();
    	
    	currencyApi(fromCountry, toCountry, amount);
    }

    public static void currencyApi(String fromCountry, String toCountry, int amount) {
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/ea53bffc242bd314f3502e6f/latest/USD");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject jsonObject = new JSONObject(response.toString());

                JSONObject conversionRates = jsonObject.getJSONObject("conversion_rates");
                
                double currencyRatefromCountry= conversionRates.getDouble(fromCountry);
                double currencyRateToCountry = conversionRates.getDouble(toCountry);
                Double changeAmount = amount * (currencyRatefromCountry / currencyRateToCountry);
                
                System.out.println("Converted Amount is = " + changeAmount);
                
            } else {
                System.out.println("HTTP error: " + con.getResponseCode());
            }

            con.disconnect();
        } catch (Exception e) {
           System.out.println("Please enter valid country code");
        }
    }
}

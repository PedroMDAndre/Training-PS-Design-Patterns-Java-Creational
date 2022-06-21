package pt.paterns.structural.facade.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class FacadeEverydayDemo {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://app.pluralsight.com/profile/author/bryan-hansen");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

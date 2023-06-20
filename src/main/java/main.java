package volgarine;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String []args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert from:");
        System.out.println("(1) Canada \n(2) USA \n(3) Euro \n(4) Brazil");

        String[] currency = {"CAD", "USD", "EUR", "BRL"};
        int currencyFrom = scanner.nextInt();
        System.out.println("Convert from " + currency[currencyFrom-1] + " to: ");

        System.out.println("(1) Canada \n(2) USA \n(3) Euro \n(4) Brazil");

        int currencyTo = scanner.nextInt();

        System.out.println("Amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Convert "+ currency[currencyFrom-1] + " to "+ currency[currencyTo-1]);

        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/fixer/convert?to="+currency[currencyTo-1]+"&from="+currency[currencyFrom-1]+"&amount="+amount)
                .addHeader("apikey", "My free API KEY from https://fixer.io")
                .method("GET",null)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}

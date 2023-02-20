import model.Convert;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convert convert = new Convert();
        System.out.print("Please, enter the value you wish to convert(R$): ");
        double value = sc.nextInt();

        System.out.print("Choose the coin type: 1-EUR, 2-USD, 3-KRW, 4-GBP ");
        int coin = sc.nextInt();

        double convertedValue = 0.0;
        String symbol = "";

        switch (coin){
            case 1:
                convertedValue = convert.Euro(value);
                symbol = "€";
                break;
            case 2:
                convertedValue = convert.Dolar(value);
                symbol = "$";
                break;
            case 3:
                convertedValue = convert.Won(value);
                symbol = "₩";
                break;
            case 4:
                convertedValue = convert.Libra(value);
                symbol = "£";
                break;
        }

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedValue = symbol + df.format(convertedValue);

        System.out.println("Converted value: " + formattedValue);
    }
}
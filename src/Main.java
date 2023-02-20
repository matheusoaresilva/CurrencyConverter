import model.Convert;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convert convert = new Convert(5.17, 5.52, 0.0040,6.22);
        System.out.print("Please, enter the value you wish to convert(R$): ");
        double value = sc.nextInt();

        System.out.print("Choose the coin type: 1-EUR, 2-USD, 3-KRW, 4-GBP ");
        int coin = sc.nextInt();

        double convertedValue = 0.0;
        String symbol = "";

        switch (coin){
            case 1:
                convertedValue = convert.toDollar(value);
                symbol = "$";
                break;
            case 2:
                convertedValue = convert.ToEuro(value);
                symbol = "€";
                break;
            case 3:
                convertedValue = convert.ToWon(value);
                symbol = "₩";
                break;
            case 4:
                convertedValue = convert.ToLibra(value);
                symbol = "£";
                break;
        }

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedValue = symbol + df.format(convertedValue);

        System.out.println("Converted value: " + formattedValue);
    }
}
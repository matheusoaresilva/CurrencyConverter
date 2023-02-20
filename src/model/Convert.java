package model;

public class Convert {
    private final double conversionToDollar;
    private final double conversionToEuro;
    private final double conversionToWon;
    private final double conversionToLibra;

    public Convert(double conversionToDollar, double conversionToEuro, double conversionToWon, double conversionToLibra) {
        this.conversionToDollar = conversionToDollar;
        this.conversionToEuro = conversionToEuro;
        this.conversionToWon = conversionToWon;
        this.conversionToLibra = conversionToLibra;
    }

    public double toDollar(double value){
        return value / conversionToDollar;
    }

    public double ToEuro(double value) {
        return value / conversionToEuro;
    }

    public double ToLibra(double value) {
        return value / conversionToLibra;
    }

    public double ToWon(double value) {
        return value / conversionToWon;
    }
}

package model;

public class Convert {
    private Double value;


    public Convert(){}
    public Convert(Double value) {
        this.value = value;
    }


    public double Dolar(Double value){
        Double dolar = 5.17;
        return value / dolar;
    }
    public Double Euro(Double value){
        Double euro = 5.52;
        return value / euro;
    }
    public Double Won(Double value){
        Double won = 0.0040;
        return value / won;
    }
    public Double Libra(Double value){
        Double libra = 6.22;
        return value / libra;
    }
}

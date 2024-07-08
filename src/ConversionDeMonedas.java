public class ConversionDeMonedas {

    public Conversion convertir(Moneda baseCoin, Moneda targetCoin, double cantidad) {
        double exchangeRate = targetCoin.getTasaCambio() / baseCoin.getTasaCambio();
        double conversionResult = cantidad * exchangeRate;
        return new Conversion(baseCoin.getCodigo(), targetCoin.getCodigo(), exchangeRate, conversionResult);
    }
}


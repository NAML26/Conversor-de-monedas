
public class Conversion {

    private String baseCode;
    private String targetCode;
    private double exchangeRate;
    private double conversionResult;

    public Conversion(String baseCode, String targetCode, double exchangeRate, double conversionResult) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.exchangeRate = exchangeRate;
        this.conversionResult = conversionResult;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }
}
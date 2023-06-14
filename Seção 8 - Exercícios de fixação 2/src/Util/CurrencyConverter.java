package Util;
/**
 *
 * @author Ivan
 */
public class CurrencyConverter {
    public static final double TAX = 0.06;
    
    public static double dolarConverter(double dolar, double dolarValue) {
        return (dolar + TAX * dolar) * dolarValue;
    }
}

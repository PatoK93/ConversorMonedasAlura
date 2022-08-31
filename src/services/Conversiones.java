package services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import valores.Moneda;

public class Conversiones {
	
    public static BigDecimal convertirRealDolar(BigDecimal valorInicial) {
        return valorInicial.divide(Moneda.dolar, 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal convertirRealEuro(BigDecimal valorInicial){
        return valorInicial.divide(Moneda.euro, 2, RoundingMode.HALF_UP);
    };
    
    public static BigDecimal convertirRealLibraEsterlina(BigDecimal valorInicial) {
        return valorInicial.divide(Moneda.libraEsterlina, 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal convertirRealPesoArgentino(BigDecimal valorInicial){
        return valorInicial.divide(Moneda.pesoArgentino, 2, RoundingMode.HALF_UP);
    };

    public static BigDecimal convertirRealPesoChileno(BigDecimal valorInicial) {
        return valorInicial.divide(Moneda.pesoChileno, 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal convertirDolarReal(BigDecimal valorInicial){
        return valorInicial.multiply(Moneda.dolar);
    };

    public static BigDecimal convertirEuroReal(BigDecimal valorInicial) {
        return valorInicial.multiply(Moneda.euro);
    }

    public static BigDecimal convertirLibraEsterlinaReal(BigDecimal valorInicial){
        return valorInicial.multiply(Moneda.libraEsterlina);
    };
    
    public static BigDecimal convertirPesoArgentinoReal(BigDecimal valorInicial){
        return valorInicial.multiply(Moneda.pesoArgentino);
    };
    
    public static BigDecimal convertirPesoChilenoReal(BigDecimal valorInicial){
        return valorInicial.multiply(Moneda.pesoChileno);
    };
    
}

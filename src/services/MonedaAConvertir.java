package services;

import java.math.BigDecimal;
import mensajes.TipoConversion;

public class MonedaAConvertir {

    public BigDecimal realizarConversion(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case TipoConversion.realDolar -> {
                return Conversiones.convertirRealDolar(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.realEuro -> {
                return Conversiones.convertirRealEuro(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.realLibraEsterlina -> {
                return Conversiones.convertirRealLibraEsterlina(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.realPesoArgentino -> {
                return Conversiones.convertirRealPesoArgentino(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.realPesoChileno -> {
                return Conversiones.convertirRealPesoChileno(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.dolarReal -> {
                return Conversiones.convertirDolarReal(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.euroReal -> {
                return Conversiones.convertirEuroReal(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.libraEsterlinaReal -> {
                return Conversiones.convertirLibraEsterlinaReal(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.pesoArgentinoReal -> {
                return  Conversiones.convertirPesoArgentinoReal(BigDecimal.valueOf(valorInicial));
            }
            case TipoConversion.pesoChilenoReal -> {
                return Conversiones.convertirPesoChilenoReal(BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA!");
        }
        
    }
}

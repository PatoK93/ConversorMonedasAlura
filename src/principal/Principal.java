package principal;

import java.math.BigDecimal;
import cuadroDeDialogo.CuadroDeDialogo;
import services.MonedaAConvertir;
import utils.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		boolean continua = true;
		Utils repite = new Utils();
		CuadroDeDialogo cuadro = new CuadroDeDialogo();
		String conversionDeMoneda = "Convertir Moneda";
		MonedaAConvertir monedaAConvertir = new MonedaAConvertir();
		
        Validador validador = new Validador();
		
		while(continua){
			String operacion = cuadro.panelEleccionConversion();
			
			if(operacion.equals(conversionDeMoneda)) {
				
				String operacionMonedas = cuadro.panelEleccionMonedaAMoneda();
				
				String valorAConvertir = cuadro.panelValorConversion();

                if(!validador.verificar(valorAConvertir)){
                	cuadro.valorInvalido();
                } else{
                    double valorInicial = validador.transformarEnDouble(valorAConvertir);
                    BigDecimal valorConvertido = monedaAConvertir.realizarConversion(operacionMonedas, valorInicial);
                    cuadro.valorConvertido(valorConvertido);
                }
			}
			continua = repite.intentaRepetir();
		}
		

	}

}

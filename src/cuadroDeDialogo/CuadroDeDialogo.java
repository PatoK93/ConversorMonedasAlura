package cuadroDeDialogo;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import mensajes.TipoConversion;

public class CuadroDeDialogo {
	
	private String conversionDeMoneda = "Convertir Moneda";
	
	public String panelEleccionConversion () {
	    String operacion = JOptionPane.showInputDialog(null, "Elige la operación a realizar",
	            "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
	                    {this.conversionDeMoneda}, "Elección").toString();
	    return operacion;
	}
	
    public boolean panelContinua(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "Programa terminado!");
                return false;
        }
        return true;
    }
    
	public String panelEleccionMonedaAMoneda () {
        String operacionMonedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                		TipoConversion.realDolar,
                		TipoConversion.realEuro,
                		TipoConversion.realLibraEsterlina,
                		TipoConversion.realPesoArgentino,
                        TipoConversion.realPesoChileno,
                        TipoConversion.dolarReal,
                        TipoConversion.euroReal,
                        TipoConversion.libraEsterlinaReal,
                        TipoConversion.pesoArgentinoReal,
                        TipoConversion.pesoChilenoReal},
                "que es esto").toString();
	    return operacionMonedas;
	}
	
	public String panelValorConversion () {
        String valorAConvertir = JOptionPane.showInputDialog("Introduce el valor a convertir");
	    return valorAConvertir;
	}
	
	public void valorInvalido () {
		JOptionPane.showMessageDialog(null, "Valor Inválido!");
	}
	
	public void valorConvertido (BigDecimal valorConvertido) {
        JOptionPane.showMessageDialog(null, valorConvertido);
	}
	

}

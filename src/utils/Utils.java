package utils;

import cuadroDeDialogo.CuadroDeDialogo;

public class Utils {

    public boolean intentaRepetir(){
    	CuadroDeDialogo cuadro = new CuadroDeDialogo();
    	boolean continua = cuadro.panelContinua();
    	return continua;
    }
    
    
}

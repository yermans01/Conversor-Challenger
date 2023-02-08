package inicio;
//libreria para mostrar una ventana.
import javax.swing.JOptionPane;
//se importa funcion de monedas y temperatura.
import conMonedas.function;
import conTemperatura.functionTemp;

public class inicio {
	public static void main (String[] args) {
//crea una instancia de moneda y temperatura.
		function monedas = new function();
		functionTemp temperatura = new functionTemp();
//metodo while        
		while(true) {
			String opciones = (JOptionPane.showInputDialog(null, 
								"Seleccione una opción de conversión ", "Menu", 
								JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			
			switch(opciones) {
			
//caso conversor de monedas
        	case "Conversor de Moneda":
//indicamos que ingrese la cantidad a convertir.
        		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
//validar que lo que se ingreso sea un numero 
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);
//finalizar la convercion. y consultar si desea continuar o cerrar
                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                    }
//si no se ingresa un valor valido, mensaje de no valido.
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;
//segundo caso temperatura.                    	
        	case "Conversor de Temperatura":
//validar el valor ingresado.
            	 input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     temperatura.ConvertirTemperatura(Minput);
//consultar si desea continuar o cerrar.
                     int respuesta = 0;
                     respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                     if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                     } else {
                         JOptionPane.showMessageDialog(null, "Programa terminado");                     
                     }  
//valor no valido
                 } else {
                     JOptionPane.showMessageDialog(null, "Valor inválido");                
                 }
                 break;
		}
	}
}
//validar el numero del input
	   public static boolean ValidarNumero(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            if(x >= 0 || x < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	    }
	}

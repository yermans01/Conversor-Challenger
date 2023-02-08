package conMonedas;
import javax.swing.JOptionPane;

public class function {
//se realiza la instancia
	conMonedas monedas = new conMonedas();
	conPesos pesos = new conPesos();
//se hace el metodo	
    public void ConvertirMonedas(double Minput) {
//opciones a mostrar
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Peso Chileno a Dólar", 
    			 "De Peso Chileno a Euro", 
    			 "De Peso Chileno a Libras",
    			 "De Peso Chileno a Yen",
    			 "De Peso Chileno a Won Coreano",
    			 "De Dólar a Peso Chileno", 
    			 "De Euro a Peso Chileno", 
    			 "De Libras a Peso Chileno",
    			 "De Yen a Peso Chileno",
    			 "De Won Coreano a Peso Chileno"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Peso Chileno a Dólar":
        	monedas.convertirPclDolar(Minput);
        	break;
        case "De Peso Chileno a Euro":
        	monedas.convertirPclEuros(Minput);
        	break;
        case "De Peso Chileno a Libras":
        	monedas.convertirPclLibras(Minput);
        	break;
        case "De Peso Chileno a Yen":
        	monedas.convertirPclYen(Minput);
        	break;
        case "De Peso Chileno a Won Coreano":
        	monedas.convertirPclWon(Minput);
        	break;    	    	                          
        case "De Dólar a Peso Chileno":
        	pesos.convertirDolaresPcl(Minput);
        	break;
        case "De Euro a Peso Chileno":
        	pesos.convertirEurosPcl(Minput);
        	break;
        case "De Libras a Peso Chileno":
        	pesos.convertirLibrasPcl(Minput);
        	break;
        case "De Yen a Peso Chileno":
        	pesos.convertirYenPcl(Minput);
        	break;
        case "De Won Coreano a Peso Chileno":
            pesos.convertirWonPcl(Minput);
            break;
        }
    }
}

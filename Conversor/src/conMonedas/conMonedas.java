package conMonedas;
import javax.swing.JOptionPane;

public class conMonedas {

	public void convertirPclDolar(double valor) {
//conversor de peso a dolar dolar de 07/02/23
		double monedaDolar = valor / 0.0013;
//redondeo del valor
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
//mostrar el valor
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void convertirPclEuros(double valor) {
		double monedaEuro = valor / 0.0012;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void convertirPclLibras(double valor) {
		double monedaLibra = valor / 0.0010;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void convertirPclYen(double valor) {
		double monedaYen = valor / 0.16;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void convertirPclWon(double valor) {
		double monedaWon = valor / 1.58;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}

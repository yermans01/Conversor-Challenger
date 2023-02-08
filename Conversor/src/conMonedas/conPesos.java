package conMonedas;
import javax.swing.JOptionPane;

public class conPesos {
	
		public void convertirDolaresPcl(double valor) {
			double monedaDolar = valor * 0.0013;
			monedaDolar = (double) Math.round(monedaDolar *100d)/100;
	        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Chilenos");
		}
		
		public void convertirEurosPcl(double valor) {
			double monedaEuro = valor * 0.0012;
			monedaEuro = (double) Math.round(monedaEuro *100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Chilenos");
		}
		
		public void convertirLibrasPcl(double valor) {
			double monedaLibra = valor * 0.0010;
	        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
	        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Chilenos");
		}
		
		public void convertirYenPcl(double valor) {
			double monedaYen = valor * 0.16;
	        monedaYen = (double) Math.round(monedaYen *100d)/100;
	        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Chilenos");
		}
		
		public void convertirWonPcl(double valor) {
			double monedaWon = valor * 1.58;
	        monedaWon = (double) Math.round(monedaWon *100d)/100;
	        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Chilenos");
		}
}

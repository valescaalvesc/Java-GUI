import javax.swing.JOptionPane;

public class GuiJava {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showConfirmDialog(null, "Hello "+name);
		
		// o uso do Integer.parseInt foi feito, pois o JOption... est� esperando uma "String" e 
		//nesse caso haver� a entrada de um "int", ent�o tem que fazer essa convers�o.
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showConfirmDialog(null, "You are"+age+ "years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showConfirmDialog(null, "You are"+height+ "cm tall");
	}

}

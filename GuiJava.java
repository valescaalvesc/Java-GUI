import javax.swing.JOptionPane;

public class GuiJava {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showConfirmDialog(null, "Hello "+name);
		
		// o uso do Integer.parseInt foi feito, pois o JOption... está esperando uma "String" e 
		//nesse caso haverá a entrada de um "int", então tem que fazer essa conversão.
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showConfirmDialog(null, "You are"+age+ "years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showConfirmDialog(null, "You are"+height+ "cm tall");
	}

}

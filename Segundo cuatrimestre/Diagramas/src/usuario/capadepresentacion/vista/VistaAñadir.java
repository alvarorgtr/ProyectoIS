package usuario.capadepresentacion.vista;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaAñadir extends JFrame implements VistasUsuario {

	private Button guardar;
	private Button cancelar;
	private JLabel introducirNombre;
	private JLabel introducirContra;
	private JTextField nombre;
	private JTextField contra;
	String[] opPermiso = {"Administrador de rectorado", "Administrador de facultad",
			"Secretario de tipo PAS", "Secretario de tipo PDI"};
	
}

package usuario.capadepresentacion.vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import usuario.capadepresentacion.vista.VistasUsuario;

public class VistaActividad extends JFrame implements VistasUsuario{

	private JLabel elegir;
	private String[] opciones = {"A�adir usuario", "Eliminar usuario", "Log out", "Acceso a la base de datos de empleados"};
	private JComboBox op;
	private JButton aceptar;

}
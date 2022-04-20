package uniandes.dpoo.taller4.Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class LightOut {

	private JFrame frmLightout;
	private JTextField CampoJugadas;
	private JTextField CampoJugador;

	/**
	 * Iniciar la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightOut window = new LightOut();
					window.frmLightout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crear la aplicacion
	 */
	public LightOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLightout = new JFrame();
		frmLightout.setTitle("LightOut");
		frmLightout.setBounds(100, 100, 697, 525);
		frmLightout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLightout.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel CintaOpciones = new JPanel();
		CintaOpciones.setBackground(Color.CYAN);
		frmLightout.getContentPane().add(CintaOpciones, BorderLayout.NORTH);
		
		JTextPane txtTamano = new JTextPane();
		txtTamano.setEditable(false);
		txtTamano.setBackground(Color.CYAN);
		txtTamano.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTamano.setText("Tama\u00F1o:");
		CintaOpciones.add(txtTamano);
		
		JComboBox desplegable = new JComboBox();
		desplegable.setModel(new DefaultComboBoxModel(new String[] {"2x2", "3x3", "4x4", "5x5"}));
		CintaOpciones.add(desplegable);
		
		JTextPane txtDificultad = new JTextPane();
		txtDificultad.setEditable(false);
		txtDificultad.setBackground(Color.CYAN);
		txtDificultad.setFont(new Font("Arial", Font.PLAIN, 14));
		txtDificultad.setText("Dificultad: ");
		CintaOpciones.add(txtDificultad);
		
		JRadioButton btnFacil = new JRadioButton("Facil");
		btnFacil.setBackground(Color.CYAN);
		btnFacil.setFont(new Font("Arial", Font.PLAIN, 14));
		CintaOpciones.add(btnFacil);
		
		JRadioButton btnMedio = new JRadioButton("Medio");
		btnMedio.setFont(new Font("Arial", Font.PLAIN, 14));
		btnMedio.setBackground(Color.CYAN);
		CintaOpciones.add(btnMedio);
		
		JRadioButton btnDificil = new JRadioButton("Dificil");
		btnDificil.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDificil.setBackground(Color.CYAN);
		CintaOpciones.add(btnDificil);
		
		JPanel menus = new JPanel();
		menus.setBackground(Color.WHITE);
		frmLightout.getContentPane().add(menus, BorderLayout.EAST);
		GridBagLayout gbl_menus = new GridBagLayout();
		gbl_menus.columnWidths = new int[]{57, 0};
		gbl_menus.rowHeights = new int[]{138, 58, 0, 65, 0};
		gbl_menus.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_menus.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		menus.setLayout(gbl_menus);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBackground(Color.CYAN);
		btnNuevo.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
		gbc_btnNuevo.anchor = GridBagConstraints.SOUTH;
		gbc_btnNuevo.insets = new Insets(0, 0, 5, 0);
		gbc_btnNuevo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNuevo.gridx = 0;
		gbc_btnNuevo.gridy = 0;
		menus.add(btnNuevo, gbc_btnNuevo);
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setBackground(Color.CYAN);
		btnReiniciar.setFont(new Font("Arial", Font.PLAIN, 14));
		GridBagConstraints gbc_btnReiniciar = new GridBagConstraints();
		gbc_btnReiniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReiniciar.insets = new Insets(0, 0, 5, 0);
		gbc_btnReiniciar.gridx = 0;
		gbc_btnReiniciar.gridy = 1;
		menus.add(btnReiniciar, gbc_btnReiniciar);
		
		JButton btnTop10 = new JButton("TOP 10");
		btnTop10.setFont(new Font("Arial", Font.PLAIN, 14));
		btnTop10.setBackground(Color.CYAN);
		GridBagConstraints gbc_btnTop10 = new GridBagConstraints();
		gbc_btnTop10.insets = new Insets(0, 0, 5, 0);
		gbc_btnTop10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTop10.gridx = 0;
		gbc_btnTop10.gridy = 2;
		menus.add(btnTop10, gbc_btnTop10);
		
		JButton btnCambiarJugador = new JButton("CAMBIAR JUGADOR");
		btnCambiarJugador.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCambiarJugador.setBackground(Color.CYAN);
		GridBagConstraints gbc_btnCambiarJugador = new GridBagConstraints();
		gbc_btnCambiarJugador.gridx = 0;
		gbc_btnCambiarJugador.gridy = 3;
		menus.add(btnCambiarJugador, gbc_btnCambiarJugador);
		
		JPanel panelJugadas = new JPanel();
		frmLightout.getContentPane().add(panelJugadas, BorderLayout.SOUTH);
		panelJugadas.setLayout(new BoxLayout(panelJugadas, BoxLayout.X_AXIS));
		
		JTextPane txtJugadas = new JTextPane();
		txtJugadas.setEditable(false);
		txtJugadas.setText("Jugadas:");
		txtJugadas.setFont(new Font("Arial", Font.PLAIN, 14));
		txtJugadas.setBackground(Color.WHITE);
		panelJugadas.add(txtJugadas);
		
		CampoJugadas = new JTextField();
		CampoJugadas.setEditable(false);
		CampoJugadas.setBackground(Color.WHITE);
		panelJugadas.add(CampoJugadas);
		CampoJugadas.setColumns(10);
		
		JTextPane txtJugador = new JTextPane();
		txtJugador.setEditable(false);
		txtJugador.setText("Jugador:");
		txtJugador.setFont(new Font("Arial", Font.PLAIN, 14));
		txtJugador.setBackground(Color.WHITE);
		panelJugadas.add(txtJugador);
		
		CampoJugador = new JTextField();
		CampoJugador.setFont(new Font("Arial", Font.PLAIN, 14));
		CampoJugador.setBackground(Color.WHITE);
		CampoJugador.setEditable(false);
		panelJugadas.add(CampoJugador);
		CampoJugador.setColumns(10);
	}

}

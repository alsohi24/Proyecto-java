package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArregloPaciente;
import clases.Paciente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class GuiPaciente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIngresar;
	private JButton btnModificar;
	private JButton btnListar;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnGrabar;
	private JLabel lblCodigo;
	private JLabel lblApellidos;
	private JLabel lblNombres;
	private JLabel lblTelfono;
	private JLabel lblDni;
	private JTextField txtcodigo;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JScrollPane scrollPane;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
//  Tipo de operación a procesar: Adicionar, Modificar, Eliminar o Consultar
	private int tipoOperacion;
	//  Constantes para los tipos de operaciones
	public final static int INGRESAR = 0;
	public final static int MODIFICAR = 1;
	public final static int ELIMINAR  = 2;
	public final static int CONSULTAR = 3;
	public final static int LISTAR=4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPaciente frame = new GuiPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiPaciente() {
		setTitle("Consola Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(523, 229, 89, 23);
		contentPane.add(btnIngresar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(622, 229, 89, 23);
		contentPane.add(btnModificar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(523, 263, 89, 23);
		contentPane.add(btnListar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(622, 263, 89, 23);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(523, 297, 89, 23);
		contentPane.add(btnEliminar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(622, 297, 89, 23);
		contentPane.add(btnGrabar);
		btnGrabar.setEnabled(false);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(523, 41, 46, 14);
		contentPane.add(lblCodigo);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(508, 80, 62, 14);
		contentPane.add(lblApellidos);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(508, 120, 62, 14);
		contentPane.add(lblNombres);
		
		lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(508, 158, 62, 14);
		contentPane.add(lblTelfono);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(541, 193, 46, 14);
		contentPane.add(lblDni);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(588, 38, 62, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setEditable(false);
		txtcodigo.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(588, 77, 145, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setEditable(false);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(588, 117, 145, 20);
		contentPane.add(txtNombres);
		txtNombres.setEditable(false);
		txtNombres.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(586, 155, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(586, 190, 86, 20);
		contentPane.add(txtDni);
		txtDni.setEditable(false);
		txtDni.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 467, 340);
		contentPane.add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("CÓDIGO");
		modelo.addColumn("APELLIDOS");
		modelo.addColumn("NOMBRES");
		modelo.addColumn("TELEFONO");
		modelo.addColumn("DNI");
		tblTabla.setModel(modelo);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(660, 35, 89, 26);
		contentPane.add(btnBuscar);
		btnBuscar.setEnabled(false);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(e);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent e) {
		tipoOperacion = INGRESAR;
		txtcodigo.setText(Integer.toString(ap.codigoCorrelativo()));
		txtApellidos.setText("");
		txtNombres.setText("");
		txtTelefono.setText("");
		txtDni.setText("");
		habilitarEntradas();
		habilitarBotones();
		txtApellidos.requestFocus();
		btnBuscar.setEnabled(false);

	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		tipoOperacion = MODIFICAR;
		txtcodigo.setEditable(true);
		habilitarEntradas();
		habilitarBotones();
		txtcodigo.setText("");
		txtcodigo.requestFocus();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		listar();
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		tipoOperacion = CONSULTAR;
		txtcodigo.setEditable(true);
		habilitarBotones();
		txtcodigo.requestFocus();
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		tipoOperacion = ELIMINAR;
		txtcodigo.setEditable(true);
		habilitarBotones();
		txtcodigo.requestFocus();
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		switch (tipoOperacion) {
		case INGRESAR:
			adicionarPersona();
			break;
		case MODIFICAR:
			modificarPersona();
			break;
		case ELIMINAR:
			eliminarPersona();
	}
	}
	
	ArregloPaciente ap= new ArregloPaciente();
	private JButton btnBuscar;
//  Métodos tipo void sin parámetros
	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<ap.tamaño(); i++) {
			Object[] fila = { ap.obtener(i).getcodigoPaciente(),
					          ap.obtener(i).getApellidos(),
					          ap.obtener(i).getNombre(),
					          ap.obtener(i).getTelefono(),
					          ap.obtener(i).getDni()};
			
			modelo.addRow(fila);
		}
	}
	
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  Métodos que retornan valor sin parámetros
	void habilitarBotones() {
		btnIngresar.setEnabled(true);
		btnConsultar.setEnabled(true);
		btnEliminar.setEnabled(true);
		btnGrabar.setEnabled(true);
		btnListar.setEnabled(true);
		btnModificar.setEnabled(true);
		btnBuscar.setEnabled(true);
	}
	void habilitarEntradas(){
		txtApellidos.setEditable(true);
		txtNombres.setEditable(true);
		txtTelefono.setEditable(true);
		txtDni.setEditable(true);
	}
	
	void deshabilitarEntradas(){
		txtApellidos.setEditable(false);
		txtNombres.setEditable(false);
		txtTelefono.setEditable(false);
		txtDni.setEditable(false);
	}
	
	int leerCodigo() {
		return Integer.parseInt(txtcodigo.getText());
	}
	String leerApellidos() {
		return txtApellidos.getText().trim();
	}
	String leerNombre() {
		return txtNombres.getText().trim();
	}
	String leerTelefono() {
		return txtTelefono.getText().trim();
	}
	String leerDni() {
		return txtDni.getText().trim();
	}
	
	void adicionarPersona() {
		int codigo = leerCodigo();
		String apellidos = leerApellidos();
			if (apellidos.length() > 0)
				try {
					String nombres = leerNombre();
					try {
						String telefono = leerTelefono();
						try {
							String dni = leerTelefono();
							Paciente nueva = new Paciente(codigo, apellidos, nombres, telefono,dni);
					  		ap.adicionar(nueva);
							listar(); 
							txtcodigo.setText(Integer.toString(ap.codigoCorrelativo()));
							txtApellidos.setText("");
							txtNombres.setText("");
							txtTelefono.setText("");
							txtDni.setText("");
							txtApellidos.requestFocus();
						}catch(Exception e) {
							mensaje("Ingrese DNI correcto");
							txtDni.setText("");
							txtDni.requestFocus();
						}
					}
					catch (Exception e) {
						mensaje("Ingrese TELEFONO correcto");
						txtTelefono.setText("");
						txtTelefono.requestFocus();	
					}
				}
				catch (Exception e) {
					mensaje("Ingrese NOMBRE correcto");
					txtNombres.setText("");
					txtNombres.requestFocus();
				}
			else {
				mensaje("Ingrese APELLIDOS correcto");
				txtApellidos.setText("");
				txtApellidos.requestFocus();
			}
	}
	
	void consultarPersona() {
		Paciente x = ap.buscar(leerCodigo());
		if (x != null) {
			txtApellidos.setText(x.getApellidos());
			txtNombres.setText("" + x.getNombre());
			txtTelefono.setText("" + x.getTelefono());
			txtDni.setText(""+x.getDni());
		}
		else {
			mensaje("El código " + leerCodigo() + " no existe");
			txtcodigo.setText("");
			txtcodigo.requestFocus();
		}
	}
	void modificarPersona() {
		Paciente x = ap.buscar(leerCodigo());
		if (x != null) {
			String apellidos = leerApellidos();
			if (apellidos.length() > 0)
				try {
					String nombres = leerNombre();
					try {
						String telefono = leerTelefono();
						try {
							String dni = leerDni();
							listar(); 
							x.setApellidos(apellidos);
							x.setNombre(nombres);
							x.setTelefono(telefono);
							x.setDni(dni);
							listar();
							txtcodigo.requestFocus();
						}catch(Exception e) {
							mensaje("Ingrese DNI correcto");
							txtDni.setText("");
							txtDni.requestFocus();
						}
					}
					catch (Exception e) {
						mensaje("Ingrese TELEFONO correcto");
						txtTelefono.setText("");
						txtTelefono.requestFocus();	
					}
				}
				catch (Exception e) {
					mensaje("Ingrese NOMBRE correcto");
					txtNombres.setText("");
					txtNombres.requestFocus();
				}
			else {
				mensaje("Ingrese APELLIDOS correcto");
				txtApellidos.setText("");
				txtApellidos.requestFocus();
			}
		}
		else {
			mensaje("Ingrese CÓDIGO correcto");
			txtcodigo.setText("");
			txtcodigo.requestFocus();
		}
	}
	void eliminarPersona() {
		try {
			Paciente x = ap.buscar(leerCodigo());
			if (x != null) {
				ap.eliminar(x);
				listar();
				txtApellidos.setText("");
				txtNombres.setText("");
				txtTelefono.setText("");
				txtDni.setText("");
				txtcodigo.requestFocus();
			}
			else {
				mensaje("El código " + leerCodigo() + " no existe");
				txtcodigo.setText("");
				txtcodigo.requestFocus();
			}
		}
		catch (Exception e) {
			mensaje("Ingrese CÓDIGO correcto");
			txtcodigo.setText("");
			txtcodigo.requestFocus();
		}	
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		consultarPersona();
	}
}

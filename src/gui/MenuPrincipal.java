package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 425);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCama = new JMenuItem("Cama");
		mnNewMenu_1.add(mntmCama);
		
		JMenuItem mntmPaciente = new JMenuItem("Paciente");
		mnNewMenu_1.add(mntmPaciente);
		
		JMenuItem mntmMedicina = new JMenuItem("Medicina");
		mnNewMenu_1.add(mntmMedicina);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu_1.add(menuBar_1);
		
		JMenu mnNewMenu_2 = new JMenu("Internamiento");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnPago = new JMenu("Pago");
		menuBar.add(mnPago);
		
		JMenu mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Listado de Pacientes Internados");
		mnReporte.add(mntmNewMenuItem);
		
		JMenuItem mntmListadoDeInternamientos = new JMenuItem("Listado de internamientos pagados");
		mnReporte.add(mntmListadoDeInternamientos);
		
		JMenuItem mntmListadoDeAtenciones = new JMenuItem("Listado de atenciones pagadas");
		mnReporte.add(mntmListadoDeAtenciones);
		
		JMenuItem mntmDetalleDeAtencin = new JMenuItem("Detalle de atenci\u00F3n");
		mnReporte.add(mntmDetalleDeAtencin);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

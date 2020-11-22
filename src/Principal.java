import java.awt.EventQueue;

//Comentario para poder hacer el commit de entrega final 2ºtry

/**
 * Clase principal del Buscaminas
 * @author Juan José Prieto Talavero
 * @version v1.0
 */
public class Principal {

	/**
	 * Método main
	 * @param args : Cadenas de parámetros del main
	 * @see inicializar() metodo que inicia todo {@link VentanaPrincipal#inicializar()}
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal ventana = new VentanaPrincipal();
					ventana.inicializar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

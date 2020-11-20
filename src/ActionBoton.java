import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas. De alguna
 * manera tendrá que poder acceder a la ventana principal. Se puede lograr
 * pasando en el constructor la referencia a la ventana. Recuerda que desde la
 * ventana, se puede acceder a la variable de tipo ControlJuego
 * 
 * @author Juan José Prieto Talavero
 **
 */
public class ActionBoton implements ActionListener {

	private VentanaPrincipal ventana;
	private int i;
	private int j;

	public ActionBoton(VentanaPrincipal ventana, int i, int j) {
		// TODO
		this.ventana = ventana;
		this.i = i;
		this.j = j;
	}

	/**
	 * Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
		if(ventana.getJuego().abrirCasilla(i, j)){
			ventana.mostrarNumMinasAlrededor(i, j);	
			if(ventana.getJuego().esFinJuego()){
				ventana.mostrarFinJuego(false);
			}
		}else{
			ventana.mostrarFinJuego(true);			
		}
	}

}

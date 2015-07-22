// ERIDARIETA
// una classe (sottoclasse) deriva da un'altra classe eriditando i metodi e le variabili se non sono private
// L'eridarietà la si utilizza quando abbiamo 2 classi che hanno gran parte degli attributi in comune
// In questo caso "Motorino" verrà chiamata super classe e "motorinoImmatricolato" sarà chiamato classe estesa
// ATTENZIONE!! Il costruttore non viene ereditato
// NON è possibile per una classe estendere 2 classi 
public class Motorino {
	private String colore;
	private float velocita;
	private String tipo;
	private boolean antifurto = false;

	public Motorino(String colore, float velocita, String tipo) {

		this.colore = colore;
		this.velocita = velocita;
		this.tipo = tipo;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAntifurto() {
		return antifurto;
	}

	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
	}

	public void accelera(float v) {
		if (antifurto == false) {
			velocita += v;
		}
	}

	public void inserisciAntifurto() {
		antifurto = true;
	}

}

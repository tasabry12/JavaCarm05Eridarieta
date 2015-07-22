public class MotorinoImmatricolato extends Motorino {
	private float maxVelocita;
	private String targa;
	
	

	public MotorinoImmatricolato(String colore, float velocita, String tipo,
			float maxVelocita, String targa) {
		super(colore, velocita, tipo);             //utilizzo il costruttore della superclasse
		this.maxVelocita = maxVelocita;
		this.targa = targa;
	}

	public float getMaxVelocita() {
		return maxVelocita;
	}

	public void setMaxVelocita(float maxVelocita) {
		this.maxVelocita = maxVelocita;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public void getMax(){
		System.out.println("Velocità massima: "+maxVelocita);
	}

}


public class mainClass {

	public static void main(String[] args) {
		Motorino m =new Motorino("Rosso", 30 ,"Piaggio");
		m.accelera(50);
		m.inserisciAntifurto();
		float v = m.getVelocita();
		
		System.out.println(v);
		
		MotorinoImmatricolato mI= new MotorinoImmatricolato("Rosso", 20, "Piaggio", 50, "EF945CJ");	
		
		System.out.println(mI.getMaxVelocita());
		
		System.out.println(mI.getColore());
		



	}

}

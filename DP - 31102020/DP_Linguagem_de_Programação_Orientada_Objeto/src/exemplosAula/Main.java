package exemplosAula;

public class Main {

	public static void main(String[] args) {
		
		Ponto p = new Ponto();
		p.setX(2);
		p.setY(5);
		
		Ponto w = p;
		System.out.println(p.getY());
		System.out.println(w.getY());

	}

}

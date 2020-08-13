
public class Main {
	public static void imprimirInfo(Cafe c) {
		System.out.println("Pre�o: " + c.informarPreco() + ", Ingredientes: " + c.informarIngredientes());
	}
	
	public static void main(String[] args) {
		Cafe c = new CafeSimples();
		imprimirInfo(c);
		
		c = new ComLeite(c);
		imprimirInfo(c);
		
		c = new CafeSimples();
		c = new ComSorvete(c);
		imprimirInfo(c);
	}

}

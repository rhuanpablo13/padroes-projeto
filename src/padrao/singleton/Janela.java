package padrao.singleton;

// n�vel de frequencia 4

public class Janela {

	/* atributo statico */
	private static Janela instance = null;
	
	/* construtor privado para impedir que se d� "new" na classe Janela*/
	private Janela() { }
	

	public static Janela getInstance() {
		
		if (instance == null) {
			instance = new Janela();
		}
		return instance;
	}
	
}

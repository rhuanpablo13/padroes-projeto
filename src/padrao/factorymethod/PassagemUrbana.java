package padrao.factorymethod;

import java.util.Date;

public class PassagemUrbana extends Passagem {

	public PassagemUrbana(String origem, String destino, Date dataEmissao) {
		super(origem, destino, dataEmissao);	
	}

	@Override
	public String toString() {	
		return "Passagem Urbana = " + super.toString();
	}
}

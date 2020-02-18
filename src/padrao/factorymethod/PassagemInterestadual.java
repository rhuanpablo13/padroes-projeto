package padrao.factorymethod;

import java.util.Date;

public class PassagemInterestadual extends Passagem {

	public PassagemInterestadual(String origem, String destino, Date dataEmissao) {
		super(origem, destino, dataEmissao);
	}
	
	@Override
	public String toString() {	
		return "Passagem Interestadual = " + super.toString();
	}
	
}

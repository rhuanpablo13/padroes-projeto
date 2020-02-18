package padrao.factorymethod;

import java.util.Date;

public class EmpresaInterestadual extends Empresa {

	@Override
	Passagem emitePassagem(String origem, String destino, Date dataEmissao) {
		return new PassagemInterestadual(origem, destino, dataEmissao);
	}
	
}

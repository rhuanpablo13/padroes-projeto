package padrao.factorymethod;

import java.util.Date;

public class EmpresaUrbana extends Empresa {

	@Override
	Passagem emitePassagem(String origem, String destino, Date dataEmissao) {
		return new PassagemUrbana(origem, destino, dataEmissao);
	}
	
}

package padrao.factorymethod;

import java.util.Date;

public abstract class Empresa {

	abstract Passagem emitePassagem(String origem, String destino, Date dataEmissao);
	
}

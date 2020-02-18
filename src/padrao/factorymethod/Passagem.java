package padrao.factorymethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Passagem {

	private String origem;
	private String destino;
	private Date dataEmissao;
	
	
	public Passagem(String origem, String destino, Date dataEmissao) {	
		this.origem = origem;
		this.destino = destino;
		this.dataEmissao = dataEmissao;
	}


	@Override
	public String toString() {
		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy HH:ss:MM");
		return "Passagem [origem=" + origem + ", destino=" + destino + ", dataEmissao=" + form.format(dataEmissao) + "]";
	}
	
}

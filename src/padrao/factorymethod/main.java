package padrao.factorymethod;

import java.util.Date;

//nível de frequencia 5

public class main {
	
	public static void main(String[]  args) {
		
		Empresa empresa = new EmpresaInterestadual();
		Passagem passagem = empresa.emitePassagem("São Paulo", "Rio de Janeiro", new Date());
		System.out.println(passagem.toString());
		
		empresa = new EmpresaUrbana();
		passagem = empresa.emitePassagem("São Paulo", "Interior São Paulo", new Date());
		System.out.println(passagem.toString());
		
	}
}

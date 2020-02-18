package padrao.factorymethod;

import java.util.Date;

//n�vel de frequencia 5

public class main {
	
	public static void main(String[]  args) {
		
		Empresa empresa = new EmpresaInterestadual();
		Passagem passagem = empresa.emitePassagem("S�o Paulo", "Rio de Janeiro", new Date());
		System.out.println(passagem.toString());
		
		empresa = new EmpresaUrbana();
		passagem = empresa.emitePassagem("S�o Paulo", "Interior S�o Paulo", new Date());
		System.out.println(passagem.toString());
		
	}
}

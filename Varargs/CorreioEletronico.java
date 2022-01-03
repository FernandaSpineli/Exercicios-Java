package alga_works_java_varargs;

public class CorreioEletronico {

	public void enviarEmail(String... emails) {
		//PERCORRE TODOS OS EMAILS RECEBIDOS
		for(String email : emails) {
			//ENVIA O EMAIL
			System.out.println("E-mail enviado para: " + email);
		}
		
	}
}

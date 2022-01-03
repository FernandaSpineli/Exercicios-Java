package alga_works_java_varargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		
		CorreioEletronico correio = new CorreioEletronico();
		
		
//		String[] emails = new String[2];
//		emails[0] = "fernandaspinx@gmail.com";
//		emails[1] = "fernandaspineli@hotmail.com";
//		correio.enviarEmail(emails);
		
//		correio.enviarEmail(new String[] {"fernanda@hotmail.com", "fernandaspinx@gmail.com"});
		
		  correio.enviarEmail("fernanda@hotmail.com", "fernandaspinx@gmail.com");
		
		
	}
}

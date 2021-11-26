import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String texto1 = "PROGRAMAÇÃO ORIENTADA A OBJETOS"; 
		String texto2 = "JAVA SE"; 
		String textO3 = "SENAI - JANDIRA";
		
		// Criação de um Obejto do Tipo ArrayList de Strings
		ArrayList<String> dados = new ArrayList<String>();
		
		//Adicionando Valores no ArrayList 
		dados.add(texto1);
		dados.add(texto2);
		dados.add(textO3);
		
		//Removendo Elementos de um ArrayList
		//dados.remove(0);
		
		if (dados.isEmpty()) {
			System.out.println("O Array está vazio!");
		}
		
		else {
			System.out.println("O Array possui dados: " +dados.size());
			System.out.println("DADOS - " + dados);
			
			System.out.println();
			System.out.println("Indice 0 = " +dados.get(0));
			System.out.println("Indice 1 = " +dados.get(1));
			System.out.println("Indice 2 = " +dados.get(2));
		}
		
		//Manipulando ArrayList com o Uso de Loops de Repetição:
		
		//Loop For:
		System.out.println();
		System.out.println("*****LOOP FOR*****");
		for (int i = 0; i < dados.size(); i++) {
			System.out.println("ÍNDICE: " +i +" Valor: " +dados.get(i));
		}
		
		//Loop For Each
		System.out.println();
		System.out.println("*****LOOP FOR EACH*****");
		for (String dado : dados) {
			System.out.println("Valor: " +dado);
		}
		
		//Método For Each do ArrayList com Lambda
		dados.forEach(dado->{
			System.out.println("Valor: " +dado);
		});
	}

}

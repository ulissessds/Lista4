import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Agenda agendaSMD = new Agenda();
		
		List<Telefone> laizlaTels = new ArrayList<Telefone>();
		List<Telefone> davidTels = new ArrayList<Telefone>();
		List<Telefone> matheusTels = new ArrayList<Telefone>();
		
		Telefone tel1 = new Telefone(32465674);
		Telefone tel2 = new Telefone(981665201, 85);
		Telefone tel3 = new Telefone(992465674, 88);
		Telefone tel4 = new Telefone(994365607, 85);
		
		laizlaTels.add(tel1);
		laizlaTels.add(tel2);
		davidTels.add(tel3);
		matheusTels.add(tel4);
		
		Contato laizla = new Contato("Láizla", laizlaTels,"lzfernandes@alu.ufc.br");
		Contato david = new Contato("David", davidTels);
		Contato matheus = new Contato("Matheus", matheusTels,"malexandria@gmail.com");
		
		agendaSMD.adicionarItemContato(laizla);
		agendaSMD.adicionarItemContato(david);
		agendaSMD.adicionarItemContato(matheus);
		
		System.out.println(agendaSMD.toString());
		
		agendaSMD.removerItemContato(matheus);
		
		System.out.println("\n" + agendaSMD.toString());
	}

}

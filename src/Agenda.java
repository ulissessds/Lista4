import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<Contato> contatos;
	
	//Construtor
	Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	
	Agenda(List<Contato> pContatos){
		this.contatos = pContatos;
	}
	
	//Métodos
	void adicionarItemContato(Contato contatinho){
		contatos.add(contatinho);
	}
	
	boolean removerItemContato(Contato ex){
		for(Contato c : contatos){
			if (c.getNome() == ex.getNome() && c.getEmail()==ex.getEmail()){
				contatos.remove(ex);
				return true;
			}
		}
		return false;
	}

	//GET e SET
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Agenda [contatos=" + contatos + "]";
	}
}

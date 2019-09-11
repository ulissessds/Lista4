import java.util.List;

public class Contato {
	//Atributos
	String nome;
	String email;
	List<Telefone> listaCel;
	
	//Construtor
	Contato(String pNome, List<Telefone> pListaCel){
		this.nome = pNome;
		this.listaCel = pListaCel;
	}
	Contato(String pNome, List<Telefone> pListaCel, String pEmail){
		this.nome = pNome;
		this.listaCel = pListaCel;
		this.email = pEmail;
	}
	
	//Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Telefone> getListaCel() {
		return listaCel;
	}
	public void setListaCel(List<Telefone> listaCel) {
		this.listaCel = listaCel;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", listaCel=" + listaCel + "]";
	}	
}

public class Telefone {
	//Atributo
	int numero;
	int DDD;

	//Construtor
	Telefone (int pNumero){
		this.numero = pNumero;
	}
	Telefone (int pNumero, int pDDD){
		this.numero = pNumero;
		this.DDD = pDDD;
	}
	
	//Get e Set
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", DDD=" + DDD + "]";
	}
}

package ProjetoSala;

public class Sala {
	
	int numero;
	int capacidade;
	boolean status;
	
	public Sala (int numero, int capacidade, boolean status) {
		this.numero = numero;
		this.capacidade = capacidade;
		this.status = status;
	}
	
	
	void ocupado () {
		if (status == true) {
			status = false;
			System.out.println("\n Sala Ocupada");
		}else {
			System.out.println("\n Sala ja esta ocupada");
		}
	}
	
	
	void desocupado() {
		if (status == false) {
			status = true;
			System.out.println("\n Sala Desocupada");
		}else {
			System.out.println("\n Sala ja esta Desocupada");
			
		}
		
	}


	public String getDescricao(){
		return "Numero da Sala: "
		+this.numero 
		
		+", capacidade = "
		+this.capacidade
		
		+", status = "
		+this.status ;
				
	}
	
		
}

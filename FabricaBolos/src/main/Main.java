package main;


import factory.Bolos;
import factory.BolosFactory;

public class Main {

	public static void main(String[] args) {
		
		BolosFactory tipoBolo = new BolosFactory(); // Se instacia esse objeto, pois ele que permite gerar as classes concretas de acordo com o valor do parâmetro que está na factory.
		
		Bolos umBolo = tipoBolo.assarBolo("chocolate"); //Não posso instaciar o objeto chocolate no main, pois já foi instaciado na factory.
		//Chamo o objeto na interface que ele pega métodos e depois, como abaixo, chamo o método específico que se deseja utilizar.
		umBolo.prepararBolo(); //Chamar o método da interface Bolos.
		
		
		umBolo = tipoBolo.assarBolo("fuba");
		umBolo.prepararBolo();
		
		umBolo = tipoBolo.assarBolo("milho");
		umBolo.prepararBolo();
		
	}

}

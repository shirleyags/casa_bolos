package main;


import factory.Bolos;
import factory.BolosFactory;

public class Main {

	public static void main(String[] args) {
		
		BolosFactory tipoBolo = new BolosFactory(); // Se instacia esse objeto, pois ele que permite gerar as classes concretas de acordo com o valor do par�metro que est� na factory.
		
		Bolos umBolo = tipoBolo.assarBolo("chocolate"); //N�o posso instaciar o objeto chocolate no main, pois j� foi instaciado na factory.
		//Chamo o objeto na interface que ele pega m�todos e depois, como abaixo, chamo o m�todo espec�fico que se deseja utilizar.
		umBolo.prepararBolo(); //Chamar o m�todo da interface Bolos.
		
		
		umBolo = tipoBolo.assarBolo("fuba");
		umBolo.prepararBolo();
		
		umBolo = tipoBolo.assarBolo("milho");
		umBolo.prepararBolo();
		
	}

}

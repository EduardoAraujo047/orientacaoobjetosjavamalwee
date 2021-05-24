package br.com.senai;

public class ProgramaPrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();

		carro1.setMarca("Honda");
		carro1.setModelo("Civic Sedan EXS 1.8/1.8 Flex 16V Aut. 4p");
		carro1.setAno(2007);
		carro1.setQtdPortas(4);
		
		carro2.setMarca("Honda");
		carro2.setModelo("Fit");
		carro2.setAno(2016);
		carro2.setQtdPortas(4);
		
		carro3.setMarca("Fiat");
		carro3.setModelo("Palio EX Century 1.0 mpi Fire 16v 2p");
		carro3.setAno(2002);
		carro3.setQtdPortas(4);
		
		carro4.setMarca("Volvo");
		carro4.setModelo("V50 2.4 20V 140cv Aut.");
		carro4.setAno(2008);
		carro4.setQtdPortas(4);
		
		carro5.setMarca("Ferrari");
		carro5.setModelo("F355 GTS F1");
		carro5.setAno(1998);
		carro5.setQtdPortas(2);
		
		System.out.println("-> Primeiro carro: ");
		System.out.println("Marca do carro: "+ carro1.getMarca());
		System.out.println("Modelo do carro: "+ carro1.getModelo());
		System.out.println("Ano do carro: "+ carro1.getAno());
		System.out.println("Quantidade de portas: "+ carro1.getQtdPortas());
		System.out.println("----------------------------------------");
		System.out.println("-> Segundo carro: ");
		System.out.println("Marca do carro: "+ carro2.getMarca());
		System.out.println("Modelo do carro: "+ carro2.getModelo());
		System.out.println("Ano do carro: "+ carro2.getAno());
		System.out.println("Quantidade de portas: "+ carro2.getQtdPortas());
		System.out.println("----------------------------------------");
		System.out.println("-> Terceiro carro: ");
		System.out.println("Marca do carro: "+ carro3.getMarca());
		System.out.println("Modelo do carro: "+ carro3.getModelo());
		System.out.println("Ano do carro: "+ carro3.getAno());
		System.out.println("Quantidade de portas: "+ carro3.getQtdPortas());
		System.out.println("----------------------------------------");
		System.out.println("-> Quarto carro: ");
		System.out.println("Marca do carro: "+ carro4.getMarca());
		System.out.println("Modelo do carro: "+ carro4.getModelo());
		System.out.println("Ano do carro: "+ carro4.getAno());
		System.out.println("Quantidade de portas: "+ carro4.getQtdPortas());
		System.out.println("----------------------------------------");
		System.out.println("-> Quinto carro: ");
		System.out.println("Marca do carro: "+ carro5.getMarca());
		System.out.println("Modelo do carro: "+ carro5.getModelo());
		System.out.println("Ano do carro: "+ carro5.getAno());
		System.out.println("Quantidade de portas: "+ carro5.getQtdPortas());
	}

}

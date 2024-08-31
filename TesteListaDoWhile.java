package br.com.fiap.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.model.Carro;

public class TesteListaDoWhile {
	
	 // String 
	 static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int 
	 static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	// double 
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// Preparar lista ArrayList
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		
		// Preparar objeto 
		Carro objCarro = null;
		
		// faça 
		do {
			objCarro = new Carro();
			objCarro.setCodigo(inteiro("Informe o codigo"));
			objCarro.setMarca(texto("Informe a marca"));
			objCarro.setModelo(texto("Informe o modelo"));
			objCarro.setValor(real("Informe o valor"));
			
			listaCarros.add(objCarro);
			
			// enquanto
		} while ( JOptionPane.showConfirmDialog(null, "Cadastrar mais carros?", 
				                                      "CADASTRO DE CARROS",
				                                      JOptionPane.YES_NO_OPTION,
				                                      JOptionPane.QUESTION_MESSAGE
				                                ) ==0);
		
		//saidas (foreach)
		for(Carro carro : listaCarros) {			
			System.out.println(
					"\n\nCodigo: " + carro.getCodigo() + 
					"\nMarca: " + carro.getMarca() + 
					"\nModelo: " + carro.getModelo() +
					"\nValor: " + carro.getValor()
					);
		}		

	}

}

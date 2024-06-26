package br.com.jaybank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.jaybank.banco.modelo.Cliente;
import br.com.jaybank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jean");
		cliente.setProfissao("Dev");
		cliente.setCpf("21365487555");
		
		ContaCorrente cc = new ContaCorrente(12, 223);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}

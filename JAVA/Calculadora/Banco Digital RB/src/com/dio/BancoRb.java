package com.dio;

import java.util.ArrayList;
import java.util.List;


public class BancoRb {
	private String nome;
	private List<Conta> contas=new ArrayList<Conta>();
	private List<Cliente> clientes=new ArrayList<Cliente>();
	public BancoRb() {
		
	}
	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {		
			return contas;
	}
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void addCliente(Cliente c) {
		this.clientes.add(c);
	}
	public void addConta(Conta c) {
		this.contas.add(c);
	}

}

package com.dio;

public class Cliente {
	private String nome;
	private int senha;
	private double rendaMensal;
	public Cliente(String nome, int senha, double rendaMensal) {
		this.nome =nome;
		this.senha = senha;
		this.rendaMensal = rendaMensal;
	}
	public String getNome() {
		return nome;
	}
	public int getSenha() {
		return senha;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	
}

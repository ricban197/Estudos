package com.dio.base;

public class Pedido {
	
	private String code;//codigo do pedido
	private float preco;//total a ser pago
	private float taxa; //taxas cobras pelo servico
	public Pedido(String code,float preco) {
		this.code =code;
		this.preco=preco;
		this.taxa=preco*0.2f;
	}
	@Override
	public String toString() {
		return "Pedido [code=" + code + "]";
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.taxa=preco*0.2f;
		this.preco = preco;
	}
	public float getTaxa() {
		return taxa;
	}
	public String getCode() {
		return this.code;
	}
	
	
}

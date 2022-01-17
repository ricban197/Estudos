/**
 * 
 */
package com.dio;

import com.dio.base.Pedido;

/**
 * @author Ricardo
 *
 */
public class PrimeiroProgramaJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pedido ped =new Pedido("1234",100f);
		System.out.println("preco: " + ped.getPreco());
		System.out.println("taxa: " +ped.getTaxa());
		System.out.println("code: " +ped.getCode());
	}

}
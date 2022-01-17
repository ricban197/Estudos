package com.dio.base;

public class Hora {
	public static void Mensagem(int hora) {
		if(hora >6 && hora<12) {
			System.out.println("BOM DIA!!");
		}
		if(hora >=12 && hora<18) {
			System.out.println("BOA TARDE!!");
		}else {
			System.out.println("BOA NOITE!!");
		}
	}
}

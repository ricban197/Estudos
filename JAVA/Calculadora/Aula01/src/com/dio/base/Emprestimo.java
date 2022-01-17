package com.dio.base;

public class Emprestimo {
	public static float Total(float pedido) {
		float total;
		if(pedido <100) {
			total = pedido+(pedido*0.40f);
		}else if(pedido <1000) {
			total = pedido+(pedido*0.20f);
		}else {
			total = pedido+(pedido*0.035f);
		}
		return total;
	}
	public static float taxa(float pedido) {
		float total;
		if(pedido <100) {
			total =(pedido*0.40f);
		}else if(pedido <1000) {
			total = (pedido*0.20f);
		}else {
			total = (pedido*0.035f);
		}
		return total;
	}
	

}

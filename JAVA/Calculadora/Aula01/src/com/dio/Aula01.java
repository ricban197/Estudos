/**
 * 
 */
package com.dio;
import java.util.Scanner;
import com.dio.base.*;
/**
 * @author Ricardo
 *
 */
public class Aula01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float a,b;
		int i,op =0;
		while(op==0) {
		System.out.println("Escolha");
		System.out.println("Calculadora 01");
		System.out.println("Hora 02");
		System.out.println("Emprestimo 03");
		System.out.println("Sair 04");
		Scanner in = new Scanner(System.in);
		if(in.nextInt()==4) {op =in.nextInt();}
		
		if(in.nextInt() ==1) {
		a=5f;	
		b=15f;

		System.out.println(Calculadora.Soma(a,b));
	
		System.out.println(Calculadora.Sub(a,b));
	
		System.out.println(Calculadora.Mult(a,b));

		System.out.println(Calculadora.Div(a,b));
	
			
			
		}
		if(in.nextInt() ==2) {
			System.out.println("Informe a Hora(formato de 0 a 24) :");
			i=in.nextInt();
			Hora.Mensagem(i);;
			
		}
		if(in.nextInt() ==1) {
			System.out.println("Valor requerido:");
			a=in.nextFloat();
			b =Emprestimo.Total(a);
			System.out.println("Culto total do emprestimo: "+b);
			b= Emprestimo.taxa(a);
			System.out.println("Culto das taxas do emprestimo: "+b);
			
			
		}
		}

	}

}

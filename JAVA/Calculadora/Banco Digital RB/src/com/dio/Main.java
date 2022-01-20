package com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
				//Variaveis
				boolean terminal=true,banco=true;//terminal funcionando enquanto true
				int opcao=0;// Opcao escolida pelo cliente 
				String nome;//nome do cliente
				int senha,numeroConta;// senha do usuario//Numero  da conta destino a ser transferida
				boolean logado =false; // caso senha e nome conhecidam
				double valor;// valor nas operações
				List<Conta> contas=new ArrayList<Conta>();//consulta para transferencia
				Conta contaLogada = null;//conta do usuario logado
				int i;//auxiliar 
				BancoRb rb = new BancoRb();
				int numerodeConta;//numero de conta para teste de usuario
				boolean transferencia =false;
				
				// Fim Variaceis
				
				// Criando Contas usaveis
				// Cliente ( nome , senha , rendaMensal);|| clientes posuem nomes unicos
				Cliente c1 = new Cliente("Luiz",1234,5500.50);//cliente 1 	N° Conta -1
				Cliente c2 = new Cliente("Ana",2468,4500.40);//cliente 2 	N° Conta -2
				Cliente c3 = new Cliente("Julia",1597,4000.50);//cliente 3	N° Conta -3
				Cliente c4 = new Cliente("Enzo",1111,350);//cliente 4 		N° Conta -4
				
				rb.addCliente(c1);//add cliente a lista de clientes
				rb.addCliente(c2);//add cliente a lista de clientes
				rb.addCliente(c3);//add cliente a lista de clientes
				rb.addCliente(c4);//add cliente a lista de clientes
				
				Conta cC1 =new ContaCorrente(c1);//Conta Cliente 1
				Conta cC2 =new ContaCorrente(c2);//Conta Cliente 2
				Conta cC3 =new ContaCorrente(c3);//Conta Cliente 3
				Conta cC4 =new ContaPoupanca(c4);//Conta Cliente 4
				
				rb.addConta(cC1);
				rb.addConta(cC2);
				rb.addConta(cC3);
				rb.addConta(cC4);
				
				//fim criação de contas
				
				//Logando
			while(banco) {		
					System.out.println("Bem Vindo ao Banco Digital RB|para finalizar o banco entre com a conta 0");
					System.out.println("Entre com seu N° Conta:");
					Scanner in = new Scanner(System.in);
					numerodeConta = in.nextInt();
					if(numerodeConta ==0 ) {
						banco =false; break;
					}
					System.out.println("Entre com sua Senha:");
					in = new Scanner(System.in);
					senha = in.nextInt();
					i=0;
					for(Conta c : rb.getContas()) {//testa para todos os clientes do banco até achar um de mesmo nome e senha
						c1 =c.getCliente();						
						if(c1.getSenha() == senha && c.getConta() == numerodeConta) {
							logado =true;
							contas =rb.getContas();
							contaLogada = contas.get(i);
							System.out.println("Entrando");
							terminal =true;
							break;
							}
						i++;//cada conta esta no mesmo indice de seu cliente na lista do banco
					}
					if(!logado) {
						System.out.println("Usuario nao encontrado");
						terminal = false;//finaliza programa
					}
					//Fim logando
					
					//Opções para o cliente					
					while(terminal) {
						System.out.println("O que deseja fazer?");		
						System.out.println("1 - Para sacar");
						System.out.println("2 - Para Depositar");
						System.out.println("3 - Para Verificar Extrato");			
						System.out.println("4 - Para Transferir");
						System.out.println("5 - Para Finalizar Terminal");
						in = new Scanner(System.in);
						opcao = in.nextInt();
						switch(opcao) {
						case 1:
							System.out.println("Digite o valor a ser sacado:");
							in = new Scanner(System.in);
							valor= in.nextDouble();
							contaLogada.sacar(valor);
							break;
						case 2:
							System.out.println("Digite o valor a ser Depositado:");
							in = new Scanner(System.in);
							valor= in.nextDouble();
							contaLogada.depositar(valor);
							break;
						case 3:
							contaLogada.imprimirExtrato();
							break;
						case 4:
							System.out.println("Valor:");
							in = new Scanner(System.in);
							valor= in.nextDouble();
							System.out.println("Numero da conta destino:");
							in = new Scanner(System.in);
							numeroConta = in.nextInt();
							contas =rb.getContas();
							for(Conta c:contas) {
								if(c.numero==numeroConta) {	
									if(contaLogada.getSaldo()>=valor) {
										System.out.println("Extrato do destino //para teste antes");
										c.imprimirExtrato();
										contaLogada.transferir(valor, c);
										System.out.println("Transferencia realizada");
										transferencia =true;
										System.out.println("Extrato do destino //para teste depois");
										c.imprimirExtrato();
									}else {
										System.out.println("Transferencia falha: Saldo insuficiente");
									}
									
								}
							}
							if(!transferencia) {
								System.out.println("Transferencia falha: Conta N encontrada");
							}else {
								transferencia =false;
							}
							break;					
						case 5:
							terminal =false;
							break;					
						default:
							System.out.println("ERRO -- Opção escolhida Invalida");
							break;
						}
						//in.close();
					}
		}
	}

}

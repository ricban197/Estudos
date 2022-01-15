package com.dio;
import  com.dio.base.Pedido;
public class MyFirstProgram {

    public static void main(String[] args){
        Pedido pedido =new Pedido(code="0001234");
        System.out.println(pedido);
    }
}
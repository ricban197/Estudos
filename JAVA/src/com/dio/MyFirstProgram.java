package com.dio;
import  com.dio.base.Pedido;

public class MyFirstProgram {
    public static void main(String[] args){
        final Pedido pedido =new Pedido("code1234");
        System.out.println(pedido);
    }
}
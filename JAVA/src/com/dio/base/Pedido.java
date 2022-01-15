package com.dio.base;
public  class Pedido {
    private  final String code;//codico do pedido

    public Pedido(String code){
        this.code=code;
    }
    @Override
    public String Tostring(){
    return  "Pedido={"+
            "code='"+code+"'"+
            "}";
    }

}
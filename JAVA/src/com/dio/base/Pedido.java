package com.dio.base;

public  class Pedido {

    private final String code;//codico do pedido

    public Pedido(String code){
        this.code=code;
    }
    //@Override
    public String tostring(){
        return  "Pedido={"+
                "code='"+code+"'"+
                "}";
    }

}
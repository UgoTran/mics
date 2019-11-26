package com.hivetech.xml.model;


public class ClientC {
    private ClientA clientA;

    public void setClientA(ClientA clientA) {
        this.clientA = clientA;
    }

    public void printResult(){
        System.out.println(clientA.result());
    }

}

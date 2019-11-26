package com.hivetech.xml.model;

public class ClientA {
    private ClientB clientB;
    private ClientD clientD;

    public ClientA(ClientB clientB, ClientD clientD) {
        this.clientB = clientB;
        this.clientD = clientD;
    }

    public String result(){
        return "result in ClientA";
    }

//    public void setClientD(ClientD clientD) {
//        this.clientD = clientD;
//    }
}

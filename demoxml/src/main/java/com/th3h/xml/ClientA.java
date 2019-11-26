package com.th3h.xml;

public class ClientA {
    private ClientB clientB;
    private ClientD clientD;

    public ClientA(ClientB clientB, ClientD clientD) {
        this.clientB = clientB;
        this.clientD = clientD;
        System.out.println("create ClientA " + hashCode());
    }

    public String result(){
        return "result in ClientA";
    }

//    public void setClientD(ClientD clientD) {
//        this.clientD = clientD;
//    }
}

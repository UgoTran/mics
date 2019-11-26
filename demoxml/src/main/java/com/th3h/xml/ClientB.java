package com.th3h.xml;

public class ClientB {
    private ClientC clientC;

    void showInB(){
        clientC.show();
    }

    public void setClientC(ClientC clientC) {
        this.clientC = clientC;
    }
}

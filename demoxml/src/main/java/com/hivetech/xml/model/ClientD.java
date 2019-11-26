package com.hivetech.xml.model;

public class ClientD {
    private ClientD clientD;

    public void setClientD(ClientD clientD) {
        this.clientD = clientD;
    }

    public void showD(ClientD clientDD){
        System.out.println(this.hashCode() == clientDD.hashCode() ? "same":"not same");
    }
}

package com.alineselle;

import java.util.Objects;

import static java.util.Objects.*;

public class Produto {

private String sku;
private String nome;

public Produto(String sku, String nome){

    this.sku = sku;// IHPD2360 : le code qui va representer un produit
    this.nome=nome;//impressora HP Deskjet 2360
}

public String getSku(){

    return sku;
}

public void setSku(String Sku){

    this.sku=sku;
}

public String getNome(){

    return nome;
}

public void setName(String nome){

    this.nome=nome;
}

    @Override
    public String toString() {
        return "Produto [sku="+sku+" , nome="+nome+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getSku(), produto.getSku());
    }

    @Override
    public int hashCode() {

        return hash(getSku());
    }
}

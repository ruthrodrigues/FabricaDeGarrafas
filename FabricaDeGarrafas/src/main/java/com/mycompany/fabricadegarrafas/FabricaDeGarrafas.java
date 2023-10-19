package com.mycompany.fabricadegarrafas;

import Modelo.CaixaDeGarrafa;
import Modelo.Esteira;

public class FabricaDeGarrafas {

    public static void main(String[] args) {
     
        Esteira entrega = new Esteira();
        CaixaDeGarrafa garrafa = new CaixaDeGarrafa(entrega);

        garrafa.addGarrafa();
        garrafa.addGarrafa();
        garrafa.addGarrafa();
        
    }
}

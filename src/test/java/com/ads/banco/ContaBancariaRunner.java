package com.ads.banco;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class ContaBancariaRunner {
    public static void main(String[] args) {
        System.out.println("Executando testes:");
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
       junit.run(ContaBancariaTeste.class);
       
    }
}
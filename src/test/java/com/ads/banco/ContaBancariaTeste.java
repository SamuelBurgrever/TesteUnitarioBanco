package com.ads.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {
    

private ContaBancaria contaBancaria;



	@BeforeEach
	public void init(){
		System.out.println("init");
		contaBancaria = new ContaBancaria(500);
        

        
	}

	@Test
	public void testContaDeposito(){
       
        System.out.println("Teste 1");
        contaBancaria.depositar(1000);
    
        assertEquals(1500, contaBancaria.getSaldo());

        	}


    @Test
    public void testContaSacar(){
        System.out.println("Teste 2");
        contaBancaria.sacar(200);

        assertEquals(300, contaBancaria.getSaldo());

    }
}

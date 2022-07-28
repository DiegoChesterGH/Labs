package com.chester.persona;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;

public class Prueba
{
    public static void main(String[] args)
    {
        List myLista = Arrays.asList("2","3","8");

        myLista.forEach(item -> tiraExcepcion(item));
    }

    private static void tiraExcepcion(Object item) throws Exception {

        System.out.println(item);
        if (1 == 1)
            throw new Exception("dd");
    }
}

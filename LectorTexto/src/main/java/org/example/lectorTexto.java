package org.example;

import java.io.*;

public class lectorTexto
{
    public static void main( String[] args )
    {
        InputStream isr = lectorTexto.class.getClassLoader().getResourceAsStream("entrada.txt");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(isr));
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }


        } catch (IOException e) {
            System.out.println("Error en el programa: " + e.getMessage());
        }
    }

}

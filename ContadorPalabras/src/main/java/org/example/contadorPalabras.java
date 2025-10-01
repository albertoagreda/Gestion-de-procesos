package org.example;

import java.io.*;

public class contadorPalabras
{
    public static void main(String[] args) {
        int total = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.trim().split("\\s+");
                for (String p : palabras) {
                    if (!p.isEmpty()) total++;
                }
            }
            System.out.println("Total de palabras: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

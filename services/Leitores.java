package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitores {
    public void leitorDeTXT () throws IOException {
        // Leia o arquivo.txt
        BufferedReader leitorDePerguntas = new BufferedReader(new FileReader("formulario.txt"));
        String linhaASerLida;
        // enquanto houverem linhas, leia as linhas.

        while ((linhaASerLida = leitorDePerguntas.readLine()) != null ) {
            // Depois print na tela cada linha.
            System.out.println(linhaASerLida);
        }

    }
}

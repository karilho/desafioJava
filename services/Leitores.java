package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitores {
    public List<String> leitorDeTXT() throws IOException {
        List<String> listaComTodasPerguntas = new ArrayList<>();

        try {
            BufferedReader leitorDePerguntas = new BufferedReader(new FileReader("formulario.txt"));

            // Leia o arquivo.txt
            String linhaASerLida;
            // enquanto houverem linhas, leia as linhas.
            while ((linhaASerLida = leitorDePerguntas.readLine()) != null ) {
                //Adicione as perguntas dentro do array
                listaComTodasPerguntas.add(linhaASerLida);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listaComTodasPerguntas;

    }
}

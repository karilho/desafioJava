import services.Leitores;

import java.io.IOException;

public class main {
    // Throws io EXCEPTION - > SIGNIFICA QUE ELE VAI LANÇAR ERRO IN OUT CASO DÊ MERDA.
    public static void main(String[] args) throws IOException {
        // INSTANCIAR UM LEITOR
        Leitores leitorInstanciado = new Leitores();

        // CHAMAR O METODO LEITORDETXT DO NOSSO LEITOR INSTANCIADO.
        leitorInstanciado.leitorDeTXT();
    }
}

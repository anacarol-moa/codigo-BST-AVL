package implementacaoarvores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ImplementacaoArvores {

    public static void main(String[] args) {
        Arvore_AVL a = new Arvore_AVL();
        a.inserirElemento(10);
        a.inserirElemento(6);
        a.inserirElemento(16);
        a.inserirElemento(12);
        a.inserirElemento(38);
        a.inserirElemento(3);
        a.inserirElemento(8);
        a.inserirElemento(2);
        a.inserirElemento(4);
        a.inserirElemento(5);


        System.out.println("ARVORE BINARIA DE PESQUISA SEM BALANCEAMENTO");
        System.out.println("   ELEMENTOS ORDENADOS");

        for (int n = 10000; n <= 100000; n += 10000) {

            Arvore_Binaria arvore = new Arvore_Binaria();

            for (int i = 1; i <= n; i++) {
                arvore.inserirElemento(i); // insere elementos em ordem
            }

            arvore.buscarElemento(100001);

            System.out.println(
                    "n = " + n +
                            " | comparacoes = " + arvore.getComparacoes()
            );
        }

        System.out.println("\n   ELEMENTOS ALEATORIOS");

        for (int n = 10000; n <= 100000; n += 10000) {

            Arvore_Binaria arvore = new Arvore_Binaria();
            List<Integer> elementos = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                elementos.add(i); // cria n elementos
            }

            Collections.shuffle(elementos, new Random()); // embaralha elementos

            for (int elemento : elementos) {
                arvore.inserirElemento(elemento); // insere elementos aleatoriamente
            }

            arvore.buscarElemento(100001);

            System.out.println(
                    "n = " + n +
                            " | comparacoes = " + arvore.getComparacoes()
            );
        }

        //// arvore AVL
        System.out.println("ARVORE AVL");
        System.out.println("   ELEMENTOS ORDENADOS");

        for (int n = 10000; n <= 100000; n += 10000) {

            Arvore_AVL arvore = new Arvore_AVL();

            for (int i = 1; i <= n; i++) {
                arvore.inserirElemento(i); // insere elementos em ordem
            }

            arvore.buscarElemento(100001);

            System.out.println(
                    "n = " + n +
                            " | comparacoes = " + arvore.getComparacoes()
            );
        }

        System.out.println("\n   ELEMENTOS ALEATORIOS");

        for (int n = 10000; n <= 100000; n += 10000) {

            Arvore_AVL arvore = new Arvore_AVL();
            List<Integer> elementos = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                elementos.add(i); // cria n elementos
            }

            Collections.shuffle(elementos, new Random()); // embaralha elementos

            for (int elemento : elementos) {
                arvore.inserirElemento(elemento); // insere elementos aleatoriamente
            }

            arvore.buscarElemento(100001);

            System.out.println(
                    "n = " + n +
                            " | comparacoes = " + arvore.getComparacoes()
            );
        }
    }
}
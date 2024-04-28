import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListNew {
    public static void main(String[] args) {
        // Criar a LinkedList
        LinkedList<String> alimentos = new LinkedList<String>();

        // Adicionar elementos á lista
        alimentos.add("Almeirão");
        alimentos.add("Batata");
        alimentos.add("Cenoura");
        alimentos.add("Damasco");

        // Imprimir todos os elementos da lista
        for (String alimento : alimentos){
            System.out.print(alimento+" ");
        }

        // Utilizar o iterador para percorrer a lista
        // Primeiro, criamos o iterador
        ListIterator<String> iterador = alimentos.listIterator(); // |ABCD

        // Fazer o iterador percorrer a lista
        iterador.next(); // A|BCD
        iterador.next(); // AB|CD

        // Inserir um novo elemento usando o iterador
        iterador.add("Escarola"); //ABE|CD

        System.out.println();
        System.out.println("Esperado: Almeirão Batata Escarola Cenoura Damasco");
        for (String alimento : alimentos) {
            System.out.print(alimento + " ");
        }
        iterador.next(); //ABEC|D
        // Remover um elemento usando o iterador
        iterador.remove(); // ABE|D

        System.out.println();
        System.out.println("Esperado: Almeirão Batata Escarola Damasco");
        for (String alimento : alimentos) {
            System.out.print(alimento + " ");
        }

        // Verificar o tamanho da lista
        System.out.println();
        System.out.println("A lista tem "+ alimentos.size()+" elementos alimentos");
    }

}

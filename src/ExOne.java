import java.util.LinkedList;
import java.util.ListIterator;

public class ExOne {
    public static void main(String[] args) {
        int add = 2;
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        ListIterator<Integer> iterador = numeros.listIterator();
        for (int numero : numeros) {

        }
    }
}

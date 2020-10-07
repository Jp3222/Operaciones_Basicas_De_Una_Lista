package javaapplication81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication81 {

    public static void main(String[] args) throws Exception {
        List<String> Lista = new ArrayList<>();
        Scanner V = new Scanner(System.in);
        int opc, opc2, i;
        String Dato;
        do {
            opc2 = 1;
            System.out.println("[1]Comprobar si la lista esta vacia"
                    + "\n[2]Agregar un elemento"
                    + "\n[3]Actualizar un elemento"
                    + "\n[4]Borrar elemento"
                    + "\n[5]Buscar un elemento"
                    + "\n[6]Mostrar el tamaño de la lista"
                    + "\n[7]Vaciar la lista"
                    + "\n[8]Mostrar lista"
                    + "\n[9]Salir");
            opc = V.nextInt();
            switch (opc) {
                case 1:
                    if (Lista.isEmpty()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("La lista tiene dados");
                    }
                    break;
                case 2:
                    System.out.println("\nInserte un elemento");
                    Dato = V.next();
                    Lista.add(Dato);
                    break;
                case 3:
                    if (!Lista.isEmpty()) {
                        System.out.println("Inserte el indice del elemento");
                        i = V.nextInt();
                        if (i < 1 || i > Lista.size()) {
                            System.out.println("El elemento no existe");
                        } else {
                            System.out.println("Inserte el nuevo dato");
                            Dato = V.next();
                            Lista.set((i - 1), Dato);
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 4:
                    if (!Lista.isEmpty()) {
                        System.out.println("Inserte el indice del elemento");
                        i = V.nextInt();
                        if (i < 1 || i > Lista.size()) {
                            System.out.println("El indice no existe");
                        } else {
                            Lista.remove((i - 1));
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 5:
                    if (!Lista.isEmpty()) {
                        System.out.println("Inserte el indice del elemento");
                        i = V.nextInt();
                        if (i < 1 || i > Lista.size()) {
                            System.out.println("indice inexistente");
                        } else {
                            System.out.println("El elemento es: " + Lista.get((i - 1)));
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 6:
                    if (!Lista.isEmpty()) {
                        System.out.println("El tamaño de la lista es: " + Lista.size());
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 7:
                    if (!Lista.isEmpty()) {
                        System.out.println("Vaciando lista");
                        Lista.clear();
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 8:
                    if (!Lista.isEmpty()) {
                        Mostrar(Lista);
                    }
                    break;
                case 9:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opc != 9) {
                System.out.println("Desea hacer otra operacion [0]Si/[1]No");
                opc2 = V.nextInt();
            }
        } while (opc2 != 1);

    }

    public static void Mostrar(List M) {
        for (int i = 0; i < M.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + M.get(i));
        }
        System.out.println("");
    }

}

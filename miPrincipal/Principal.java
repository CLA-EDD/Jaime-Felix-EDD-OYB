package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner( System.in );

        System.out.println( "ORDENACION Y BUSQUEDA" );
        System.out.println( "=====================" );
        System.out.println();

        // Solicitar el total de elementos del arreglo
        System.out.print( "Proporcione el número de elementos:" );
        int n=0;

        // Crear arreglo de n elemento de tipo Integer
        Integer[] elementos;

        // Ciclo para soicitar los n elementos del arreglo
        // y almacenarlos en el arreglo
        for ( int i = 0; i < n; i++ )
        {
        }

        // Crear objeto de tipo SortingAndSearching
        SortingAndSearching<Integer> sas;

        // Hacer un ordenamiento con un metodo logaritmico

        // Mostrar los elementos del arreglo ordenado        
        System.out.println();
        System.out.println( "Ordenamiento logaritmico" );

        // Hacer un ordenamiento con un metodo secuencial

        // Mostrar los elementos del arreglo ordenado
        System.out.println();
        System.out.println( "Ordenamiento secuencial" );

        // Solicitar un numero a buscar
        System.out.println();
        System.out.print( "Proporcione un numero:" );
        int numero;

        // Realizar una busqueda lineal
        // Y mostrar el resultado
        System.out.println( "Busqueda lineal:" );

        // Solicitar un numero a buscar
        System.out.println();
        System.out.print( "Proporcione un numero:" );

        // Realizar una busqueda binaria
        // Y mostrar el resultado
        System.out.println( "Busqueda binaria:" );

        
        entrada.close();
    }
}
